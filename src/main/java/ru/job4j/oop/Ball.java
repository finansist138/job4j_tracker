package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("ball eaten");
        } else {
            System.out.println("ball run away");
        }
    }
}
