package ru.kmaster.springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        //scope = singleton
        System.out.println(classicalMusic1 == classicalMusic2);

        RapMusic rapMusic1 = context.getBean("rapMusic", RapMusic.class);
        RapMusic rapMusic2 = context.getBean("rapMusic", RapMusic.class);

        //scope = prototype
        System.out.println(rapMusic1 == rapMusic2);

        context.close();
    }
}
