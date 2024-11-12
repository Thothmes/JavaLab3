package ru.kulakov.Birds;

public class Sparrow extends Bird {

    private String text;

    public Sparrow() {
        super("Воробей");
        this.text = "чырык";
    }

    public void sing (){
        System.out.print(this.text + '\n');
    }
}
