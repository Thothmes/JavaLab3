package ru.kulakov.Birds;

/**
 * Абстрактный класс, представляющий птицу.
 * Содержит общие характеристики и поведение для всех птиц.
 */
public abstract class Bird {

    private final String name;

    /**
     * Конструктор для создания птицы с заданным именем.
     *
     * @param name имя птицы
     */
    public Bird(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя птицы.
     *
     * @return имя птицы
     */
    public String getName() {
        return name;
    }

    /**
     * Абстрактный метод для пения птицы.
     * Каждый подкласс должен реализовать свою версию пения.
     */
    public abstract void sing();
}
