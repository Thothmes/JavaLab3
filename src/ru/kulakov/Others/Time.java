package ru.kulakov.Others;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int seconds){
        this.seconds = seconds % 60;
        this.minutes = ((seconds - (seconds % 60)) / 60) % 60;
        this.hours = (((((seconds - (seconds % 60)) / 60)) - (((seconds - (seconds % 60)) / 60) % 60)) / 60) % 24;
    }

    public Time(int hours, int minutes, int seconds) {
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
    }

    public void setHours(int hours) {
        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("Некорректные значения часов");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Некорректные значения минут");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Некорректные значения секунд");
        }
        this.seconds = seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}