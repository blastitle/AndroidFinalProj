package com.oshri.finalproject.Pokemon;

import androidx.annotation.NonNull;
import com.oshri.finalproject.Pokemon.Ability.IAbility;
import com.oshri.finalproject.Types.Types;
import org.json.*;
import org.json.simple.JSONObject;

public class Pokemon {
    private String id; //Mon's ID
    private Types type1; //Primary type of Mon
    private Types type2; //Secondary Type of Mon, if applicable
    private String Name; //Mon's name
    public IAbility ability; //Its ability

    @Override
    public String toString() {
        //TODO

        return "";
    }
    public static Pokemon fromString(@NonNull JSONObject obj){
        //TODO
        return null;
    }
}
