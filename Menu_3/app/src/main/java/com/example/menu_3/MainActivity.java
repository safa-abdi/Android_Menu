package com.example.menu_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> contactList = new ArrayList<String>(
            Arrays.asList("Contact1", "Contact2", "Contact3")
    );
    ListView contactListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contactListview = findViewById(R.id.contacts);
        registerForContextMenu(contactListview);
        ArrayAdapter myAdapter = new ArrayAdapter(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                contactList
        );
        contactListview.setAdapter(myAdapter);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu3, menu);
    }
}