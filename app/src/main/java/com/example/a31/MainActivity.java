package com.example.a31;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Рафаэль", "+7 900 111-22-33", android.R.drawable.ic_menu_myplaces));
        contacts.add(new Contact("Элла", "+7 900 222-33-44", android.R.drawable.ic_menu_myplaces));
        contacts.add(new Contact("Диана", "+7 900 333-44-55", android.R.drawable.ic_menu_myplaces));

        rv.setAdapter(new ContactAdapter(this, contacts));
    }
}