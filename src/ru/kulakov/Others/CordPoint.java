package ru.kulakov.Others;

/**
 * Класс представляет точку в двумерном пространстве с координатами X и Y.
 * Координаты хранятся в виде чисел с плавающей запятой.
 */
public class CordPoint {

    private float X;
    private float Y;

    /**
     * Создает точку с указанными координатами X и Y.
     * @param X Координата по оси X
     * @param Y Координата по оси Y
     */
    public CordPoint(float X, float Y) {
        this.X = X;
        this.Y = Y;
    }

    /**
     * Возвращает массив координат точки.
     * @return Массив из двух элементов [X, Y]
     */
    public float[] getPoint() {
        return new float[]{X, Y};
    }

    /**
     * Устанавливает координату X.
     * @param X Новое значение координаты X
     */
    public void setX(float X) {
        this.X = X;
    }

    /**
     * Устанавливает координату Y.
     * @param Y Новое значение координаты Y
     */
    public void setY(float Y) {
        this.Y = Y;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }

    /**
     * Возвращает строковое представление точки в формате:
     * {X;Y} с форматированием чисел (+/-000000.00)
     * @return Строковое представление точки
     */
    @Override
    public String toString() {
        return String.format("{%,+010.2f;%,+010.2f}", X, Y);
    }
}