package com.oshri.finalproject.Pokemon;

import androidx.annotation.NonNull;
import com.oshri.finalproject.Pokemon.Ability.IAbility;
import com.oshri.finalproject.Types.Types;
import org.json.*;
import org.json.simple.JSONObject;

public class Pokemon {
    private Types type1;
    private Types type2;
    private String Name;
    public IAbility ability;

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
