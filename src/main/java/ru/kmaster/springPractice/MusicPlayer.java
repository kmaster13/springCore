package ru.kmaster.springPractice;

public class MusicPlayer {
    private Music music;

    //Пример Inversion of Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
