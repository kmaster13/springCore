package ru.kmaster.springPractice;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Порнофильмы - Я так соскучился";
    }
}
