package com.oshri.finalproject.User;

import com.oshri.finalproject.Pokemon.Pokemon;

import java.util.ArrayList;

public class User {
    private String id;
    public String name;
    private String email;
    public int wins;
    public int losses;
    public ArrayList<ArrayList<Pokemon>> teams;
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }


}
