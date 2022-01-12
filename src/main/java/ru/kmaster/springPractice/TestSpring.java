package ru.kmaster.springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("rapMusic", Music.class);

        MusicPlayer secondMusicPlayer = new MusicPlayer(music2);

        secondMusicPlayer.playMusic();

        context.close();
    }
}
