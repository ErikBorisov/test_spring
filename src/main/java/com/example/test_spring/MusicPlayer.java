package com.example.test_spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(){}

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    //IoC
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
//    public void setMusic(Music music){
//        this.music = music;
//    }
    public void playMusic(){
        for (Music music1 : music) {
            System.out.println("Playing: " + music1.getSong());
        }
    }
}
