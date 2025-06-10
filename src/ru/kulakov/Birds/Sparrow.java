package ru.kulakov.Birds;

/**
 * Класс, представляющий воробья.
 * Наследуется от класса Bird.
 */
public class Sparrow extends Bird {

    private final String text;

    /**
     * Конструктор для создания воробья.
     * Устанавливает имя "Воробей" и текст пения "чырык".
     */
    public Sparrow() {
        super("Воробей");
        this.text = "чырык";
    }

    /**
     * Реализация метода пения воробья.
     * Выводит текст пения в консоль.
     */
    @Override
    public void sing() {
        System.out.println(this.text);
    }
}