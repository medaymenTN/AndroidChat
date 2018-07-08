package com.example.aymen.androidchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    private Button btn;
    private EditText nickname;
    public static final String NICKNAME = "usernickname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //call UI component  by id
        btn = (Button) findViewById(R.id.enterchat) ;
        nickname = (EditText) findViewById(R.id.nickname);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the nickname is not empty go to chatbox activity and add the nickname to the intent extra
                 if(!nickname.getText().toString().isEmpty()){
                     Intent i  = new Intent(MainActivity.this,ChatBoxActivity.class);
                     //retreive nickname from textview and add it to intent extra
                     i.putExtra(NICKNAME,nickname.getText().toString());

                     startActivity(i);
                 }
            }
        });

    }
}
