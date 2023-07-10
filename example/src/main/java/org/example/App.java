package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class App {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main( String[] args )
    {

        Map<String, String> myName = new TreeMap<>(Comparator.reverseOrder());
        myName.put("lastName", "Prudnyk");
        myName.put("name", "Andriy");
        System.out.println(GSON.toJson(myName));

    }
}