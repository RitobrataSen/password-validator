package com.example.rito.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import static java.lang.String.valueOf;

public class PassWordVal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_word_val);


        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.textView);
                EditText et = (EditText) findViewById(R.id.editText);
                String s = et.getText().toString();

                String fail = "PassWord is Weak";
                String succ = "Password is strong";
                if(Validator.checkStr(s))
                    tv.setText(succ);
                else
                    tv.setText(fail);
            }
        });






    }


}
