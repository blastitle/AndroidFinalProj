package com.oshri.finalproject.Pokemon.Move;

import androidx.annotation.NonNull;

import com.oshri.finalproject.Pokemon.Pokemon;
import com.oshri.finalproject.Types.Types;

import org.json.simple.JSONObject;

public class Move {
    private String id; //Moves' ID
    private String name;
    private Types type; //Type of the move
    private MoveCategory category;//Category (Phys, Special or Status)
    private int basePower;//Base power of the move
    private int powerPoint;//The amount of uses left (PP)
    private int maxPowerPoints;//Max amount of uses per move
    private IAttack attack;

    @Override
    public String toString(){
        return "";
    }
    public static Move fromString(@NonNull JSONObject obj){

        //return ;
    }

}
