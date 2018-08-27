package com.example.meet17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        name = (TextView) findViewById(R.id.nameTextInfo);

        //Intent intent = getIntent();
        //name.setText(intent.getStringExtra("Name"));
    }
}
