package org.example;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> arrayTask = new ArrayList<>();

    public void addTask(Task task){
        arrayTask.add(task);
        System.out.println("add task");
    }

    public void deleteTask(String title){
        for (Task task : arrayTask){
            if(task.getTitle().equalsIgnoreCase(title)){
                arrayTask.remove(task);
            }
        }
    }
}
