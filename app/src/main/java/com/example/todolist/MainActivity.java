package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvtask;
    private ArrayList<Task> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        rvtask = findViewById(R.id.rv_task);
        rvtask.setHasFixedSize(true);

        list.addAll(TaskDatas.getListData());
        showRecyclerList();

        if (getSupportActionBar()!=null) {
            getSupportActionBar().setTitle("Aplikasi To-Do-List");
        }
    }

    private void showRecyclerList() {
        rvtask.setLayoutManager(new LinearLayoutManager(this));
        ListTaskAdapter listTaskAdapter = new ListTaskAdapter(list);
        rvtask.setAdapter(listTaskAdapter);
    }

}