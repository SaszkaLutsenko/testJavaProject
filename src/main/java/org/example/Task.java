package org.example;

public class Task {
    public String title;
    public String description;
    public boolean status;

    public Task(String title, String description, boolean status){
        this.status = status;
        this.description = description;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String info() {
        System.out.println(title + description + status);
    }
}
