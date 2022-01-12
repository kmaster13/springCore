package ru.kmaster.springPractice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Где нас нет";
    }
}
