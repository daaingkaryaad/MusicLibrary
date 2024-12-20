package com;

public class MusicLibrary {
    private String song1;
    private String song2;

    public MusicLibrary(String song1, String song2) {
        this.song1 = song1;
        this.song2 = song2;
    }

    public void PlayMusic() {
        System.out.println("The first song:" + song1);
        System.out.println("The second song" + song2);
    }

}
