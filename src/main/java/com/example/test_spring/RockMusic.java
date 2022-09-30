package com.example.test_spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {
    String[] myArray = {"Wind cries Mary", "La Grange", "Born Free"};

    public static String getRandomString(String[] array) {
        int result = new Random().nextInt(array.length);
        return array[result];
    }

    @Override
    public String getSong() {
//        return "Wind cries Mary";
        return getRandomString(myArray);
    }
}
