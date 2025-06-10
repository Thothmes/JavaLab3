package ru.kulakov.Others;

/**
 * Класс представляет точку в трехмерном пространстве, расширяя функциональность
 * двумерной точки {@link CordPoint} добавлением координаты Z.
 */
public class CordPointExtDim extends CordPoint {

    private float Z;

    /**
     * Создает точку с указанными координатами X, Y и Z.
     * @param X Координата по оси X
     * @param Y Координата по оси Y
     * @param Z Координата по оси Z
     */
    public CordPointExtDim(float X, float Y, float Z) {
        super(X, Y);
        this.Z = Z;
    }

    /**
     * Возвращает массив координат точки.
     * @return Массив из трех элементов [X, Y, Z]
     */
    @Override
    public float[] getPoint() {
        return new float[]{getX(), getY(), Z};
    }

    /**
     * Устанавливает координату Z.
     * @param Z Новое значение координаты Z
     */
    public void setZ(float Z) {
        this.Z = Z;
    }

    public float getZ() {
        return Z;
    }

    /**
     * Возвращает строковое представление точки в формате:
     * {X;Y;Z} с форматированием чисел (+/-000000.00)
     * @return Строковое представление трехмерной точки
     */
    @Override
    public String toString() {
        return String.format("{%,+010.2f;%,+010.2f;%,+010.2f}", getX(), getY(), Z);
    }
}