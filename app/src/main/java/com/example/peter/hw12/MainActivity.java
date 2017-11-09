package com.example.peter.hw12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }
    public void onChangeButtonPressed(View v)
    {
        String string1 = "";
        String string2 = "";
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        EditText inputET2 = (EditText)this.findViewById(R.id.inputET2);
        TextView answerLabel = (TextView)this.findViewById(R.id.answerLabel);

        string1 = reverseString(inputET.getText().toString());
        string2 = reverseString(inputET2.getText().toString());

        answerLabel.setText(string1 + string2);
    }

    public String reverseString(String s)
    {
        String answer = "";

        for(int i = s.length() - 1; i >= 0; i--)
        {
            answer = answer + s.charAt(i);
        }
        return answer;
    }


}
