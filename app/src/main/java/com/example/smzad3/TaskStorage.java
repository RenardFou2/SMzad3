package com.example.smzad3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static TaskStorage taskStorage = new TaskStorage();
    private List<Task> tasks;

    private TaskStorage(){
        tasks = new ArrayList<Task>();
        for (int i = 1; i <= 6; i++){
            Task task = new Task();
            task.setName("Pilne zadanie numer "+i);
            task.setDone(i % 3 == 0);
            tasks.add(task);

            if (i % 3 == 0){
                task.setCategory(Category.STUDIES);
            }
            else{
                task.setCategory(Category.HOME);
            }
        }
    }
    public static TaskStorage getInstance() { return taskStorage ; }
    public List<Task> getTasksList(){
        return tasks;
    }
    public Task getTask(UUID i){
        for (Task task : tasks)
        {
            if (task.getId().equals(i)) return task;
        }
        return null;
    }

    public void addTask(Task task){
        tasks.add(task);
    }
}
