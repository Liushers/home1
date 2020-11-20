package ru.geekbrains.java_one1;

public class Animal {
    String name = "животное";
    int runLength;
    int swimLength;
    double jumpLength;

    public Animal(String name, int runLength, int swimLength, double jumpLength) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
        this.jumpLength = jumpLength;
    }

    public void run(int val) {
        if (val > this.runLength) {
            System.out.println(this.name + " не может бежать " + val + " метров");
        } else {
            System.out.println(this.name + " бежит " + val + " метров");
        }
    }

    public void swim(int val) {
        if (val > this.swimLength) {
            System.out.println(this.name + " не может плыть " + val + " метров");
        } else {
            System.out.println(this.name + " плывет " + val + " метров");
        }
    }

    public void jump(int val) {
        if (val > this.jumpLength) {
            System.out.println(this.name + " не может прыгать на " + val + " метров");
        } else {
            System.out.println(this.name + " прыгает на " + val + " метров");
        }
    }
}
