package ru.kulakov.main;

import ru.kulakov.BinTree.Node;
import ru.kulakov.Birds.Cuckoo;
import ru.kulakov.Birds.Parrot;
import ru.kulakov.Birds.Sparrow;
import ru.kulakov.DepWork.Departament;
import ru.kulakov.DepWork.Worker;
import ru.kulakov.Others.CoordPoint;
import ru.kulakov.Others.CoordPoint3dim;
import ru.kulakov.Others.Time;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    static Main r = new Main();
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {

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
        r.choise();
    }

    public void choise() {
        while (true) {
            System.out.println("\nВведите число для выбора дальнейшего действия:");
            int choisenum = n.nextInt();
            if (choisenum == 0) {
                System.out.println("\nРабота программы завершена!");
                break;
            } else if (0 < choisenum && choisenum < 12) {
                System.out.println(tasks(choisenum));
            } else {
                System.out.print("\nВведите число в указанном диапазоне");
            }
        }
    }

    public String tasks(int args) {

        switch (args) {

            case 1:
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
                TimeCreator();
                break;

            case 2:
                System.out.println("""
                        Текст задания 11 темы 1
                        
                        Начальник отдела.
                        Измените сущности полученные в задаче 1.2.4. Необходимо гарантировать, что начальник отдела
                        гарантированно работает в том же отделе, в котором он начальник.\s
                        
                        """);
                Departament kontora1 = new Departament("IT");
                Worker Worker1 = new Worker("Иванов Иван Иванович", kontora1);
                Worker Worker2 = new Worker("Петров Петр Петрович", kontora1, true);
                System.out.print(Worker1);
                System.out.print(Worker2);
                System.out.print(kontora1.getDepLead());
                break;

            case 3:
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
                         Добавление значения. При добавлении значения возможно две ситуации
                        o Для данного узла Значение не было задано ранее. В этом случае оно задается и
                        работа завершается
                        o Для данного узла Значение ранее было задано. В этом случае определяется, больше
                        ли новое значение или меньше-равно чем текущее. Если больше – то значение
                        добавляется в правый потомок, иначе в левый. Если нужный потомок отсутствует,
                        то сначала он должен быть создан.
                         Удаление значения. В качестве аргумента передается значение, которое нужно удалить.
                        Если такое значение есть, в самом узле или любом его потомке, то удаляется узел с этим
                        значением, но все его потомки должны остаться прикрепленными к структуре.
                         Проверка на существование значения. В качестве аргумента передается значение, и
                        возвращается информация о том есть ли такое значение в самом узле или любом его
                        потомке.
                         Приведение к строке. Результатом приведения узла к строке является перечень всех
                        значений хранимых в данном узле и всех его потомках, которое должно быть получено
                        левосторонним обходом в глубину.
                        После реализации сущности, создайте её экземпляр и добавить в него числа: 3 5 4 7 1 2. Выведите
                        на экран текстовое представление узла.
                        
                        """);
/*                System.out.print(new Node().getValue());*/
                Node root = new Node();
                root.setValue(3);
                root.setValue(5);
                root.setValue(4);
                root.setValue(7);
                root.setValue(1);
                root.setValue(2);
                System.out.println(root);
                break;

            case 4:
                System.out.println("""
                        Текст задания 5 темы 3
                        
                        Трехмерная точка.
                        Создайте такой подвид сущности Точка из задачи 1.1.1, которая будет иметь не две, а три
                        координаты на плоскости: X,Y,Z.
                        
                        """);
                System.out.print(CreatorPoint());
                break;

            case 5:
                System.out.println("""
                        Текст задания 3 темы 4
                       
                        Птицы.
                        Создайте сущность Птица, которая будет являться корнем иерархии для всех, кто является
                        подвидом птицы. В разработанную сущность необходимо вынести все, что будет общим для птиц.
                        Для того чтобы определить необходимые члены класса, проанализируйте три примера птиц:
                         Воробей. Умеет петь. При пении на экран выводится строка “чырык”.
                         Кукушка. Умеет петь. При пении на экран выводится текст “ку-ку”, причем текст
                        выводится случайное количество раз в диапазоне от 1 до 10.
                         Попугай. Имеет текст и умеет петь этот текст. При инициализации обязательно
                        необходимо указать текст, который будет исполняться. При пении текст выводится не
                        весь, а первые N символов (
                        
                        """);
                break;

            case 6:
                System.out.println("""
                        Текст задания 2 темы 5
                        
                        Птичий рынок.
                        Разработайте метод, который принимает набор птиц из задачи 2.4.3 и вызывает метод пения у
                        каждой из них. Продемонстрируйте работоспособность метода, передав в него несколько
                        воробьев, кукушек и попугаев.
                        
                        """);
                BirdSong();
                break;

            case 7:
                System.out.println("""
                        Текст задания 2 темы 6
                        
                        Сравнение точек.
                        Измените сущность Точка из задачи 1.4.1. Переопределите метод сравнения объектов по
                        состоянию таким образом, чтобы две точки считались одинаковыми тогда, когда они
                        расположены в одинаковых координатах.
                        
                        """);
                CoordPoint Point1 = CreatorPoint();
                CoordPoint Point2 = CreatorPoint();
                PointComparator(Point1, Point2);
                break;

            case 8:
                System.out.println("""
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
                break;

            case 9:
                System.out.println("""
                        Текст задания 2 темы 7
                        
                        Главный метод.
                        Создайте пакет ru.surname.main (вместо surname необходимо подставить собственную
                        фамилию) в котором расположить класс с точкой входа в исполнение программы (public static void
                        main). Также следует проверить, что ни в одном другом пакете нет классов имеющих точку входа
                        в исполнение программы. В этом же пакете необходимо расположить класс (или интерфейс) с
                        методами из задач блока 2.5 и продемонстрировать их работоспособность.
                        
                        """);

                break;

            case 10:
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

                break;

            case 11:
                System.out.println("""
                        Текст задания 1 темы 8
                        
                        Отделы доверяют начальникам.
                        Данная задача предполагает, что в результате выполнения 2.7.1, сущности Отдел и Сотрудник
                        (задача 2.1.11) попали в один и тот же пакет. Ранее было выдвинуто требование о том, что
                        Начальник отдела всегда работает в том же Отделе в котором он руководит. При реализации
                        инкапсуляции на уровне класса это требование приводит к неэффективному и запутанному коду.
                        Упростите решение, предполагая что инкапсуляция необходима только на уровне пакета.
                        
                        """);
                Calc();
                break;
        }
        return "";
    }

    public void TimeCreator() {
        System.out.print("Выберите режим работы. 1 - ввести секунды, 2 - ввести часы, минуты, секунды: ");
        int num = n.nextInt();
        if (num == 1) {
            System.out.println("Введите время в секундах");
            int sec2 = n.nextInt();
            Time NewTime = new Time(sec2);
            System.out.print(NewTime);
        } else if (num == 2) {
            System.out.println("Введите часы: ");
            int hrs = n.nextInt();
            System.out.println("Введите минуты: ");
            int min = n.nextInt();
            System.out.println("Введите секунды: ");
            int sec2 = n.nextInt();
            try {
                Time NewTime = new Time(hrs, min, sec2);
            }
            catch (IllegalArgumentException TimeError) {
                System.out.print("Ошибка: " + TimeError.getMessage());
            }
        } else {
            System.out.println("Вы ввели неуказанное в режимах число");
        }
    }

    public void BirdSong () {
        Sparrow Sparrow1 = new Sparrow();
        Cuckoo Cuckoo1 = new Cuckoo();
        System.out.print("Введите текст, который должен выговорить попугай: ");
        String ParrotText = n.next();
        Parrot Parrot1 = new Parrot(ParrotText);
        System.out.print("Введите кол-во символов, которое способен выговорить попугай: ");
        int num_symbols = n.nextInt();
        Sparrow1.sing();
        Cuckoo1.sing();
        Parrot1.sing(num_symbols);
    }

    public CoordPoint CreatorPoint() {
        System.out.print("Введите количество измерений у точки");
        int dim = n.nextInt();
        if (dim == 2) {
            System.out.print("Введите точку X");
            float X = n.nextInt();
            System.out.print("Введите точку Y");
            float Y = n.nextInt();
            return new CoordPoint(X, Y);

        }
        else if (dim == 3) {
            System.out.print("Введите точку X");
            float X = n.nextInt();
            System.out.print("Введите точку Y");
            float Y = n.nextInt();
            System.out.print("Введите точку Z");
            float Z = n.nextInt();
            return new CoordPoint3dim(X, Y, Z);
        }
        else {
            System.out.print("В контексте задания запрос некорректный. В качестве результата, вы получите точку с 3 измерениями и координатами {0;0;0}");
            return new CoordPoint3dim(0, 0, 0);
        }
    }

    public void PointComparator (CoordPoint Point1, CoordPoint Point2) {
        boolean dim3Point1 = Point1.getdim3();
        boolean dim3Point2 = Point2.getdim3();
        if (dim3Point1 == dim3Point2) {
            int len = 0;
            if (dim3Point1 == true) {len = 3;}
            else if (dim3Point1 == false) {len = 2;}
            boolean SamePoint = true;
            float[] Point1Coord = Point2.getPoint();
            float[] Point2Coord = Point2.getPoint();
            for (int i = 0; i < len; i++) {
                if (Point1Coord[i] != Point2Coord[i]) {
                    SamePoint = false;
                    break;
                }
            }
            if (SamePoint == true) {
                System.out.print("Точки лежат на одних координатах");
            }
            else if (SamePoint == false) {
                System.out.print("Точки не лежат на одних координатах");
            }
        }
        else if (dim3Point1 != dim3Point2) {
            System.out.print("Точки имеют различное количество измерений");
        }
    }

    public void Calc() {
        System.out.println("Пожалуйста, укажите два аргумента.");

        String xStr = n.next();
        String yStr = n.next();

        try {
            double result = power(xStr, yStr);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод. Пожалуйста, укажите корректные числа.");
        }
    }

    public static double power(String xStr, String yStr) {
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);
        return Math.pow(x, y);
    }
}
