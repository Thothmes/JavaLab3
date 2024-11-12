package ru.kulakov.Birds;

public class Parrot extends Bird {

    private String text;

    public Parrot(String text) {
        super("Попугай");
        this.text = text;
    }

    public void sing (int N){
        if (this.text.length() < N){
            N = N - (N - this.text.length());
        }
        String new_text = this.text.substring(0,N);
        System.out.print(new_text + '\n');
    }
}

