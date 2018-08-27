package com.example.meet17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = (ListView) findViewById(R.id.list);

        String[] data = new String[UserList.getInstance().getSize()];

        for(int i = 0; i < UserList.getInstance().getSize(); i++)
            data[i] = UserList.getInstance().getUser(i).getSurname();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Intent info = new Intent(ListActivity.this, InformationActivity.class);
                info.putExtra("Name", UserList.getInstance().getUser(position).getName());
                startActivity(info);
            }
        });
    }
}
