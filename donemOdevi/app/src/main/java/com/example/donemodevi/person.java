package com.example.donemodevi;

public class person {
    private String username, name, surname, password;

    //username
    public void setUserName(String username){
        this.username = username;
    }
    public String getUserName(){
        return username;
    }

    //name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //surname
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    //password
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
