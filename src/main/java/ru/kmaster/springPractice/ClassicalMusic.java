package ru.kmaster.springPractice;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return  new ClassicalMusic();
    }

    private void doInitMethod() {
        System.out.println("Doing my initialization");
    }

    private void doDestroyMethod() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Моцарт - Турецкий марш";
    }
}
