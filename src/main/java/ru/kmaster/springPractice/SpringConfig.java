package ru.kmaster.springPractice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.kmaster.springPractice")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
