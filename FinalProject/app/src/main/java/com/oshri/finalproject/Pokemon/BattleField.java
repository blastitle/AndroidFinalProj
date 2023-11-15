package com.oshri.finalproject.Pokemon;

import com.oshri.finalproject.Utility.Event;

import java.util.EventObject;

public class BattleField {
    private Pokemon enemy; //The enemy's active pokemon
    private Pokemon activePokemon; //The user's active pokemon
    public EventObject enemySwitchOut; //Enemy switching out
    public Event onAttack; //

    //The act of the player switching out
    public void switchIn(Pokemon toSwitch){
        toSwitch.ability.init(this);//Activate the ability listener
        if(activePokemon==null) return; //If start of battle, stop.
        activePokemon.ability.terminate(this); //If there was a pokemon on the field, terminate their ability listener
    }

}
