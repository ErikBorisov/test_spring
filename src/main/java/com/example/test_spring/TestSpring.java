package com.example.test_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);
//        musicPlayer.playMusic();
//
//        Music rochMusic = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(rochMusic);
//        musicPlayer1.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
