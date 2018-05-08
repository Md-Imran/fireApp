package com.dreampany.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button btnSendData;
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mRef=new Firebase("https://fir-demo-8fd36.firebaseio.com/");
        btnSendData=(Button) findViewById(R.id.btn_value_add);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase mRefChild= mRef.child("Name");
                mRefChild.setValue("Imran");
            }
        });

    }
}
