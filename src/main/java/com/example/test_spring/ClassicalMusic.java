package com.example.test_spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    String[] myArray = {"Hungarian Rhapsody", "Toccata and Fugue in D minor", "The Four Seasons"};

    public static String getRandomString(String[] array) {
        int result = new Random().nextInt(array.length);
        return array[result];
    }

    @Override
    public String getSong() {
//        return "Hungarian Rhapsody";
        return getRandomString(myArray);
    }
}
