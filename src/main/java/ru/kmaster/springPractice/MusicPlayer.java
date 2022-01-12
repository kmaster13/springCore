package ru.kmaster.springPractice;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public void playMusic() {
        Random random = new Random();

        int randomNum = random.nextInt(3);

        switch (randomNum) {
            case 0:
                System.out.println(genres.get(0).getSong());
                break;
            case 1:
                System.out.println(genres.get(1).getSong());
                break;
            case 2:
                System.out.println(genres.get(2).getSong());
                break;
            default:
                break;
        }
    }
}
