package ru.mirea.lab2.task3;

import java.util.Random;

public class Circle {
    private Point centre;
    private int r;

    public Circle() {
        Random rnd = new Random();
        this.centre = new Point(0.0, 0.0);
        this.r = rnd.nextInt();
    }

    public Circle(Point centre, int r) {
        this.centre = centre;
    }

    public String toString() {
        return "r=" + r;
    }
}
