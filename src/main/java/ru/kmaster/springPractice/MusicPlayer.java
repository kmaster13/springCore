package ru.kmaster.springPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private double volume;

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }


    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }


    public void playMusic(GenreOfMusic genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre == GenreOfMusic.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rapMusic.getSongs().get(randomNumber));
        }
    }
}
