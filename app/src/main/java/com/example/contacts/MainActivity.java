package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    contact o1 = new contact(1, "9810524746","Divyansh Mittal");
    contact o2 = new contact(2, "9815304746","Ajay Mittal");
    contact o3 = new contact(3, "9211718360","Deepa Mittal");
    contact o4 = new contact(4, "9289408646","Shreyansh Mittal");
    contact o5 = new contact(5, "7017012697","Ajay");
    contact o6 = new contact(6, "7982269816","Deepa");
    contact o7 = new contact(7, "9810489746","Mohan Lal");
    contact o8 = new contact(8, "9858124746","Amitabh Bachan");
contact [] contacts = {o1,o2,o3,o4,o5,o6,o7,o8};
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}