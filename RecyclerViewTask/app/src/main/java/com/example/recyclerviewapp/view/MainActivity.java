package com.example.recyclerviewapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapp.Model.IconPojo;
import com.example.recyclerviewapp.view.Adapter.LogoAdapter;
import com.example.recyclerviewapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rvStudents);
        LogoAdapter adapter = new LogoAdapter(getLogo());
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);

    }
    public ArrayList getLogo() {
        ArrayList logos = new ArrayList<IconPojo>();
        logos.add(new IconPojo("Gmail", 8,R.drawable.gmail));
        logos.add(new IconPojo("Instagram", 7,R.drawable.instagram));
        logos.add(new IconPojo("Google Meet", 5,R.drawable.meet));
        logos.add(new IconPojo("Google Drive", 8,R.drawable.google_drive));
        logos.add(new IconPojo("Facebook", 6,R.drawable.facebook));
        logos.add(new IconPojo("Snapchat", 5,R.drawable.snap));
        return logos;
    }
}