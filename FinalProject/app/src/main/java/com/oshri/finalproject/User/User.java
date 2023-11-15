package com.oshri.finalproject.User;

import com.oshri.finalproject.Pokemon.Pokemon;

import java.util.ArrayList;

public class User {
    private String id; //User's ID
    public String name; //Username
    private String email; //User's EMail
    public int wins; //Win count
    public int losses; //Loss count
    public ArrayList<ArrayList<Pokemon>> teams; //Array of all saved Teams
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }


}
