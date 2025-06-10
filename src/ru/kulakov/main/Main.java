package ru.kulakov.main;

import ru.kulakov.BinTree.Node;
import ru.kulakov.Birds.Bird;
import ru.kulakov.Birds.Cuckoo;
import ru.kulakov.Birds.Parrot;
import ru.kulakov.Birds.Sparrow;
import ru.kulakov.Others.CordPoint;
import ru.kulakov.Others.CordPointExtDim;
import ru.kulakov.Others.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Главный класс для демонстрации выполнения лабораторной работы.
 * Содержит меню для выбора заданий и демонстрации результатов.
 * Обеспечивает интерактивный ввод данных с клавиатуры для всех заданий.
 */
public class Main {

    private static String[] globalArgs;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Обрабатывает ввод целочисленных значений с клавиатуры в заданном диапазоне.
     *
     * @param prompt Приглашение для ввода
     * @param minVal Минимальное допустимое значение
     * @param maxVal Максимальное допустимое значение
     * @return Введенное пользователем число
     * @throws IllegalArgumentException если minVal > maxVal
     */
    public static int inputNumber(String prompt, int minVal, int maxVal) {
        if (minVal > maxVal) {
            throw new IllegalArgumentException("Минимальное значение не может быть больше максимального");
        }
        while (true) {
            try {
                if (prompt != null) {
                    System.out.print(prompt);
                }
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= minVal && value <= maxVal) {
                    return value;
                }
                System.out.printf("Ошибка: Значение должно быть в диапазоне %d - %d%n", minVal, maxVal);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Неверный ввод. Требуется целое число.");
            }
        }
    }

    public static void main(String[] args) {
        globalArgs = args;
        System.out.print("""
                ЛАБОРАТОРНАЯ РАБОТА №2
                ВЫПОЛНИЛ - КУЛАКОВ МАКСИМ ИТ-6 (ПМИ-10/2023)
                ВАРИАНТ 7
                
                Задания 1,2 - задания 2,11 темы 1
                Задание 3 - задание 4 темы 2
                Задание 4 - задание 5 темы 3
                Задание 5 - задание 3 темы 4
                Задание 6 - задание 2 темы 5
                Задание 7 - задание 2 темы 6
                Задания 8,9,10 - задания 1,2,3 темы 7
                Задание 11 - задание 1 темы 8
                Что-бы выйти - введите 0
                
                Чтобы просмотреть интересующее вас задание - введите его номер.
                """);
        choice();
    }

    /**
     * Обрабатывает главное меню и распределяет по заданиям в зависимости от выбора пользователя.
     */
    public static void choice() {
        while (true) {
            int nextInt = inputNumber(
                    "\nВведите число (от 0 до 11) для выбора дальнейшего действия: ", 0, 11
            );
            if (nextInt == 0) {
                System.out.println("\nРабота программы завершена!");
                break;
            } else {
                tasks(nextInt);
            }
        }
    }

    /**
     * Демонстрирует задание исходя из выбранного номера.
     *
     * @param selectedTask Номер задания (от 1 до 11)
     */
    public static void tasks(int selectedTask) {
        switch (selectedTask) {
            case 1 -> {
                System.out.println("""
                        Текст задания 2 темы 1
                        
                        Время от начала суток.
                        Измените сущность Время из задачи 1.5.4. Гарантируйте, что значение, хранящееся в поле
                        данного класса всегда будет обозначать время прошедшее с начала суток. В случае если при
                        создании объекта вводится слишком большое число, все, что превышает 24 часа отбрасывается.
                        Ранее написанные методы должны быть изменены так, чтобы они отталкивались от
                        предположения, что хранящееся число – верное. Продемонстрируйте работоспособность решения
                        на примерах.
                        
                        """);
                System.out.println(promptForTime());
            }

            case 2 -> {
                System.out.println("""
                        Текст задания 11 темы 1
                        
                        Начальник отдела.
                        Измените сущности полученные в задаче 1.2.4. Необходимо гарантировать, что начальник отдела
                        гарантированно работает в том же отделе, в котором он начальник.\s
                        
                        """);
                // Реализация задания 2
            }

            case 3 -> {
                System.out.println("""
                        Текст задания 4 темы 2
                        
                        Бинарное дерево.
                        Необходимо реализовать структуру данных, представляющую собой простейшее бинарное
                        дерево. Для формирования данного дерева будет использоваться сущность Узел.
                        Состояние сущности описывается следующими характеристиками:
                        o Значение, целое число
                        o Родитель, Узел
                        o Левый потомок, Узел
                        o Правый потомок, Узел.
                        Инициализация сущности выполняется без аргументов.
                        Поведение сущности описывают следующие действия:
                        ? Добавление значения. При добавлении значения возможно две ситуации
                        o Для данного узла Значение не было задано ранее. В этом случае оно задается и
                        работа завершается
                        o Для данного узла Значение ранее было задано. В этом случае определяется, больше
                        ли новое значение или меньше-равно чем текущее. Если больше – то значение
                        добавляется в правый потомок, иначе в левый. Если нужный потомок отсутствует,
                        то сначала он должен быть создан.
                        ? Удаление значения. В качестве аргумента передается значение, которое нужно удалить.
                        Если такое значение есть, в самом узле или любом его потомке, то удаляется узел с этим
                        значением, но все его потомки должны остаться прикрепленными к структуре.
                        ? Проверка на существование значения. В качестве аргумента передается значение, и
                        возвращается информация о том есть ли такое значение в самом узле или любом его
                        потомке.
                        ? Приведение к строке. Результатом приведения узла к строке является перечень всех
                        значений хранимых в данном узле и всех его потомках, которое должно быть получено
                        левосторонним обходом в глубину.
                        После реализации сущности, создайте её экземпляр и добавить в него числа: 3 5 4 7 1 2. Выведите
                        на экран текстовое представление узла.
                        
                        """);
                System.out.println("Введите 6 целых чисел для дерева (через пробел):");
                String input = scanner.nextLine();
                String[] numbers = input.split("\\s+");
                Node root = new Node();
                for (String number : numbers) {
                    try {
                        root.setValue(Integer.parseInt(number));
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: '" + number + "' - не число");
                    }
                }
                System.out.println("Бинарное дерево: " + root);
            }

            case 4 -> {
                System.out.println("""
                        Текст задания 5 темы 3
                        
                        Трехмерная точка.
                        Создайте такой подвид сущности Точка из задачи 1.1.1, которая будет иметь не две, а три
                        координаты на плоскости: X,Y,Z.
                        
                        """);
                System.out.print(CreatorPoint());
            }

            case 5 -> System.out.println("""
                        Текст задания 3 темы 4
                       
                        Птицы.
                        Создайте сущность Птица, которая будет являться корнем иерархии для всех, кто является
                        подвидом птицы. В разработанную сущность необходимо вынести все, что будет общим для птиц.
                        Для того чтобы определить необходимые члены класса, проанализируйте три примера птиц:
                        ? Воробей. Умеет петь. При пении на экран выводится строка “чырык”.
                        ? Кукушка. Умеет петь. При пении на экран выводится текст “ку-ку”, причем текст
                        выводится случайное количество раз в диапазоне от 1 до 10.
                        ? Попугай. Имеет текст и умеет петь этот текст. При инициализации обязательно
                        необходимо указать текст, который будет исполняться. При пении текст выводится не
                        весь, а первые N символов
                        
                        """);

            case 6 -> {
                System.out.println("""
                        Текст задания 2 темы 5
                        
                        Птичий рынок.
                        Разработайте метод, который принимает набор птиц из задачи 2.4.3 и вызывает метод пения у
                        каждой из них. Продемонстрируйте работоспособность метода, передав в него несколько
                        воробьев, кукушек и попугаев.
                        
                        """);
                BirdSong();
            }

            case 7 -> {
                System.out.println("""
                        Текст задания 2 темы 6
                        
                        Сравнение точек.
                        Измените сущность Точка из задачи 1.4.1. Переопределите метод сравнения объектов по
                        состоянию таким образом, чтобы две точки считались одинаковыми тогда, когда они
                        расположены в одинаковых координатах.
                        
                        """);
                System.out.println("Создание первой точки:");
                CordPoint Point1 = CreatorPoint();
                System.out.println("Создание второй точки:");
                CordPoint Point2 = CreatorPoint();
                PointComparator(Point1, Point2);
            }

            case 8 -> System.out.println("""
                        Текст задания 1 темы 7
                        
                        Навести порядок.
                        Данная задача предполагает реорганизацию ранее написанных классов. Расположите все ранее
                        написанные классы по пакетам таким образом, чтобы логически близкие классы оказались
                        сгруппированы друг с другом. Имена пакетов должны иметь как минимум трехсоставную форму,
                        вида: ru.surname.type. Вместо surname следует подставить свою фамилию, а вместо type
                        подставить название логического блока. Например, классы описывающие точку, линию, ломаную
                        линию, фигуру, квадрат, треугольник, круг и прямоугольник можно расположить в пакете
                        ru.surname.geometry
                        
                        """);

            case 9 -> System.out.println("""
                        Текст задания 2 темы 7
                        
                        Главный метод.
                        Создайте пакет ru.surname.main (вместо surname необходимо подставить собственную
                        фамилию) в котором расположить класс с точкой входа в исполнение программы (public static void
                        main). Также следует проверить, что ни в одном другом пакете нет классов имеющих точку входа
                        в исполнение программы. В этом же пакете необходимо расположить класс (или интерфейс) с
                        методами из задач блока 2.5 и продемонстрировать их работоспособность.
                        
                        """);

            case 10 -> {
                System.out.println("""
                        Текст задания 3 темы 7
                        
                        Возведение в степень.
                        Создайте метод принимающий две строки, в которых будут записаны числа X и Y. Возвращает
                        метод результат возведения X в степень Y. Для преобразования строки в число следует
                        использовать метод Integer.parseInt, а для возведения в степень метод Math.pow. Вызовите
                        разработанный метод передав туда параметры командной строки полученные точкой входа в
                        программу. Реализуйте метод так, что бы для возведения в степень и преобразования строки
                        использовались короткие имена статических методов.
                        
                        """);
                calcPower();
            }

            case 11 -> System.out.println("""
                        Текст задания 1 темы 8
                        
                        Отделы доверяют начальникам.
                        Данная задача предполагает, что в результате выполнения 2.7.1, сущности Отдел и Сотрудник
                        (задача 2.1.11) попали в один и тот же пакет. Ранее было выдвинуто требование о том, что
                        Начальник отдела всегда работает в том же Отделе в котором он руководит. При реализации
                        инкапсуляции на уровне класса это требование приводит к неэффективному и запутанному коду.
                        Упростите решение, предполагая что инкапсуляция необходима только на уровне пакета.
                        
                        """);
        }
    }

    /**
     * Обрабатывает ввод времени с клавиатуры для задания 1.
     *
     * @return Объект Time с заданным временем
     */
    public static Time promptForTime() {
        int inputNumber = inputNumber(
                "Выберите режим работы. 1 - ввести секунды, 2 - ввести часы, минуты, секунды: ", 1, 2
        );
        if (inputNumber == 1) {
            int seconds = inputNumber("Введите время в секундах: ", 0, Integer.MAX_VALUE);
            return new Time(seconds);
        } else {
            int hours = inputNumber("Введите часы: ", 0, 23);
            int minutes = inputNumber("Введите минуты: ", 0, 59);
            int seconds = inputNumber("Введите секунды: ", 0, 59);
            return new Time(hours, minutes, seconds);
        }
    }

    /**
     * Демонстрирует пение птиц для задания 6.
     * Пользователь вводит текст для попугая и количество символов.
     */
    public static void BirdSong() {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Sparrow());
        birds.add(new Cuckoo());

        System.out.print("Введите текст для попугая: ");
        String parrotText = scanner.nextLine();
        Parrot parrot = new Parrot(parrotText);

        int numSymbols = inputNumber("Введите кол-во символов для попугая: ", 0, Integer.MAX_VALUE);
        parrot.setLimit(numSymbols);
        birds.add(parrot);

        System.out.println("\nКонцерт птиц:");
        for (Bird bird : birds) {
            bird.sing();
        }
    }

    /**
     * Создает точку (2D или 3D) на основе пользовательского ввода.
     *
     * @return Объект CordPoint или CordPointExtDim
     */
    public static CordPoint CreatorPoint() {
        int dim = inputNumber("Введите количество измерений (2 или 3): ", 2, 3);

        System.out.print("Введите координату X: ");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.print("Введите координату Y: ");
        float y = Float.parseFloat(scanner.nextLine());

        if (dim == 2) {
            return new CordPoint(x, y);
        } else {
            System.out.print("Введите координату Z: ");
            float z = Float.parseFloat(scanner.nextLine());
            return new CordPointExtDim(x, y, z);
        }
    }

    /**
     * Сравнивает две точки по координатам.
     *
     * @param point1 Первая точка
     * @param point2 Вторая точка
     */
    public static void PointComparator(CordPoint point1, CordPoint point2) {
        if (point1 instanceof CordPointExtDim && point2 instanceof CordPointExtDim) {
            CordPointExtDim p1 = (CordPointExtDim) point1;
            CordPointExtDim p2 = (CordPointExtDim) point2;

            if (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ()) {
                System.out.println("Точки идентичны в 3D пространстве");
            } else {
                System.out.println("Точки различаются в 3D пространстве");
            }
        } else if (!(point1 instanceof CordPointExtDim) && !(point2 instanceof CordPointExtDim)) {
            if (point1.getX() == point2.getX() && point1.getY() == point2.getY()) {
                System.out.println("Точки идентичны в 2D пространстве");
            } else {
                System.out.println("Точки различаются в 2D пространстве");
            }
        } else {
            System.out.println("Точки имеют разную размерность");
        }
    }

    /**
     * Выполняет возведение числа в степень для задания 10.
     * Использует аргументы командной строки или ввод с клавиатуры.
     */
    public static void calcPower() {
        String xStr, yStr;
        if (globalArgs != null && globalArgs.length >= 2) {
            xStr = globalArgs[0];
            yStr = globalArgs[1];
            System.out.println("Используются аргументы командной строки: " + xStr + " и " + yStr);
        } else {
            System.out.print("Введите основание степени: ");
            xStr = scanner.nextLine();
            System.out.print("Введите показатель степени: ");
            yStr = scanner.nextLine();
        }

        try {
            double result = calcPower(xStr, yStr);
            System.out.printf("Результат: %.0f%n", result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    /**
     * Вычисляет X в степени Y.
     *
     * @param xStr Основание степени
     * @param yStr Показатель степени
     * @return Результат возведения в степень
     * @throws NumberFormatException при неверном формате чисел
     * @throws ArithmeticException при некорректных значениях
     */
    public static double calcPower(String xStr, String yStr) {
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);

        if (y < 0) {
            throw new ArithmeticException("Отрицательные степени не поддерживаются");
        }
        if (x == 0 && y == 0) {
            throw new ArithmeticException("Ноль в нулевой степени не определен");
        }

        return Math.pow(x, y);
    }
}