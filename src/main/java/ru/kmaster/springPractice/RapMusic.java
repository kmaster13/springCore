package ru.kmaster.springPractice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Город под подошвой");
        songs.add("Моя игра");
        songs.add("Цепи");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
