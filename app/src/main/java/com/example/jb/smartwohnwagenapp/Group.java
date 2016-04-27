package com.example.jb.smartwohnwagenapp;


import java.util.ArrayList;
import java.util.List;
/**
 * Created by bicker on 25.04.2016.
 */
public class Group {

    public String string;
    public final List<String> children = new ArrayList<String>();

    public Group(String string) {
        this.string = string;
    }
}
