package com.oshri.finalproject.Utility;

import java.util.HashMap;
import java.util.Objects;

public interface IEventListener {

    public void handle(HashMap<Object,Object> info);
}
