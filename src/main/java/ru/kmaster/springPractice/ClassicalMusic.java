package ru.kmaster.springPractice;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Моцарт - Турецкий марш";
    }
}
