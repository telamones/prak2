package ru.mirea.lab2.task3;

import java.util.Random;

public class Circle {
    private Point centre;
    private int r;

    public Circle() {
        Random rnd = new Random();
        this.centre = new Point(rnd.nextInt(5,10), rnd.nextInt(2,5));
        this.r = rnd.nextInt(10);
    }

    public Circle(Point centre, int r) {
        this.centre = centre;
    }

    public String toString() {
        return "centre in point: (" + centre.getX() + "," + centre.getY() + "), r = " + r;
    }
}
