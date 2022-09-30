package com.example.test_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}
