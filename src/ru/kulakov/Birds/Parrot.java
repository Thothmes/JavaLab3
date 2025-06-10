package ru.kulakov.Birds;

/**
 * Класс, представляющий попугая.
 * Наследуется от класса Bird.
 */
public class Parrot extends Bird {

    private final String text;
    private int limit;

    /**
     * Конструктор для создания попугая.
     * Устанавливает имя "Попугай" и заданный текст пения.
     * По умолчанию limit = длине текста.
     *
     * @param text текст, который будет исполнять попугай
     */
    public Parrot(String text) {
        super("Попугай");
        this.text = text;
        this.limit = text.length();
    }

    /**
     * Устанавливает лимит символов для пения.
     *
     * @param limit количество символов для вывода (должно быть >= 0)
     */
    public void setLimit(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Лимит не может быть отрицательным");
        }
        this.limit = limit;
    }

    /**
     * Реализация метода пения попугая.
     * Выводит первые N символов текста, где N = min(limit, длина текста).
     */
    @Override
    public void sing() {
        int n = Math.min(limit, text.length());
        String newText = text.substring(0, n);
        System.out.println(newText);
    }
}