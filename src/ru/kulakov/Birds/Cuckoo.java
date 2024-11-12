package ru.kulakov.Birds;

import java.util.Random;

public class Cuckoo extends Bird {

    private String text;

    public Cuckoo() {
        super("Кукушка");
        this.text = "ку-ку";
    }

    public void sing () {
        Random random = new Random();
        int randomNumber = random.nextInt(1,10);
        StringBuilder song = new StringBuilder();
        for (int i = 0; i < randomNumber; i++) {
            song.append(this.text + " ");
        }
        System.out.print(song);
        System.out.print('\n');
    }
}