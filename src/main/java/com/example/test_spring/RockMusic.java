package com.example.test_spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
