package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bb;
    EditText un,pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bb=(Button)findViewById(R.id.button3);
        un=(EditText)findViewById(R.id.et1);
        pw=(EditText)findViewById(R.id.et2);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(un.getText().toString().trim().length()==0){un.setError("Enter UserName");}
                if(pw.getText().toString().trim().length()==0){pw.setError("Enter Password");}
                String a = un.getText().toString();
                String b = pw.getText().toString();
                if(a.equals("el") && b.equals("e")){
                    Toast.makeText(getApplicationContext(),"Fullfill",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Not",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
