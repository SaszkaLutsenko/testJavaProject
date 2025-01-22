package org.example.HW3;

public class Document implements Serializable{

    public  String title;
    public  String content;

    public Document(String title, String content){
        this.content = content;
        this.title = title;
    }

    void save(Document doc){
        if(Serializable)
            System.out.println("save");
        else
            System.out.println("this document didnt Serialible" );
    }
}
