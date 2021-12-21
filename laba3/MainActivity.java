package com.example.mylaba3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> list = new ArrayList<>();
    EditText et1;
    RecyclerView recyclerView;
    Adapter Adapter;


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        et1 = findViewById(R.id.ed1);



        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Adapter = new Adapter(list);
        recyclerView.setAdapter(Adapter);

        for(int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }

    }

    public void onClick(View view) {
        Log.i("mylog", "clicked");
        String StringFormat = et1.getText().toString();
        list.add(StringFormat);
        Adapter.notifyItemInserted(list.size() - 1);
        et1.setText("");

    }
}