package ru.kmaster.springPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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

}
