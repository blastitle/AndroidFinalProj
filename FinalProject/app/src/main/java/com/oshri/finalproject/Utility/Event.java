package com.oshri.finalproject.Utility;

import java.util.ArrayList;
import java.util.HashMap;

public class Event {
    private ArrayList<IEventListener> listeners;
    public void addListener(IEventListener l){
        listeners.add(l);
    }
    public void trigger(HashMap<Object,Object> info){
        for (IEventListener l: listeners) {
            l.handle(info);
        }
    }
    public void removeListener(IEventListener l){
        listeners.remove(l);
    }
}
