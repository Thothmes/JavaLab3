package ru.kulakov.Birds;

import java.util.Random;

/**
 * Класс, представляющий кукушку.
 * Наследуется от класса Bird.
 */
public class Cuckoo extends Bird {

    private final String text;

    /**
     * Конструктор для создания кукушки.
     * Устанавливает имя "Кукушка" и текст пения "ку-ку".
     */
    public Cuckoo() {
        super("Кукушка");
        this.text = "ку-ку";
    }

    /**
     * Реализация метода пения кукушки.
     * Выводит текст пения случайное количество раз (от 1 до 10).
     */
    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        StringBuilder song = new StringBuilder();
        for (int i = 0; i < randomNumber; i++) {
            song.append(this.text).append(" ");
        }
        System.out.println(song.toString().trim());
    }
}