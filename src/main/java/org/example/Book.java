package org.example;

public class Book {
    public String userName;
    public String email;
    public int age;

    public void setBook( String _userName, String _email, int _age){
        userName = _userName;
        email = _email;
        age = _age;
    }

    public String isStick() {
    if(age >= 18){
        return "this user is big";
    } else return "this user is not big";
    }

    public String userInfo(){
      String info = "user name is " + userName + " he has " + age + "years" + "\n";
    return info; }
}
