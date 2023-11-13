package com.example.smzad3;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public Date getDate(){
        return date;
    }
    public UUID getId(){
        return id;
    }
    public boolean isDone(){
        return done;
    }
    public void setDone(boolean finished){
        done = finished;
    }
}
