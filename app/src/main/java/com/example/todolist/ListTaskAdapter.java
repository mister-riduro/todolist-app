package com.example.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListTaskAdapter extends RecyclerView.Adapter<ListTaskAdapter.ListViewHolder> {

    private ArrayList<Task> listTask;

    public ListTaskAdapter(ArrayList<Task> Task) {
        this.listTask = Task;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coba, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Task task = listTask.get(position);
        holder.check.setText(task.getTask());
    }

    @Override
    public int getItemCount() {
        return listTask.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{

        TextView check;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            check = itemView.findViewById(R.id.task_text);
        }
    }
}
