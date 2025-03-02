package org.example;


import java.util.Date;

public class DateOfBirth {
    private Date birth;
    private String name;

    public DateOfBirth(){
    }

    public int getAge(){
        long hour = 60*60;
        long day = hour * 24;
        long year = day * 365;
        long yearMillis = (year * 1000);

        Date today =new Date();
        long diffMillis = (today.getTime() -
                this.birth.getTime());
        return (int)(diffMillis / yearMillis);
    }
}
