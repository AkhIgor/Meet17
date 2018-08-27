package com.example.meet17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameText;
    private EditText surnameText;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nameText = (EditText) findViewById(R.id.nameText);
        surnameText = (EditText) findViewById(R.id.surnameText);
        save = (Button) findViewById(R.id.enterButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(nameText.getText().toString(), surnameText.getText().toString());
                UserList.getInstance().addUser(user);

                Intent list = new Intent(MainActivity.this, ListActivity.class);
                startActivity(list);
            }
        });
    }
}