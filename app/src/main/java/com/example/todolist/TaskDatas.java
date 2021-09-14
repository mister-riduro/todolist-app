package com.example.todolist;

import java.util.ArrayList;

public class TaskDatas {
    private static String[] taskNames = {
            "Melakukan revisi user flow pada aplikasi mobile Halo Konsultan.",
            "Buat mockup icon untuk deliver.",
            "Nonton video tutorial interactive component figma.",
            "Upload eksplorasi UI",
            "Revisi UI Essential Icon Pack",
            "Upload Icon ke Iconfinder",
            "Design sync bersama mas Himma",
            "Bucin bersama ...."
    };

    static ArrayList<Task> getListData() {
        ArrayList<Task> list = new ArrayList<>();
        for (int position = 0; position < taskNames.length; position++) {
            Task task = new Task();
            task.setTask(taskNames[position]);
            list.add(task);
        }
        return list;
    }
}
