package ru.mirea.lab2.task6;

public class TestCircle {
    public static void main(String[] argc) {
        Circle a = new Circle (3, 2, 3);
        Circle b = new Circle (3,2, 5);
        System.out.println("perimeter of circle 1: " + a.getPerimeter());
        System.out.println("square of circle 2: " + b.getSquare());
        System.out.println(a.compareCircles(b));
    }
}
