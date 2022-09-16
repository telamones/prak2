package ru.mirea.lab2.task3;

public class Tester {
    private static int n;
    private static Circle[] circles = new Circle[n];

    public Tester(int n, Circle[] circles) {
        this.n=n;
        this.circles = circles;
    }

    public static Circle[] getCircles() {
        return circles;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Tester.n = n;
    }

    public static void setCircles(Circle[] circles) {
        Tester.circles = circles;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += this.circles[i].toString() + "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        int number = 10;
        Circle[] circles1 = new Circle[number];
        for (int i = 0; i < number; i++) {
            circles1[i] = new Circle();
        }
        Tester test = new Tester(number, circles1);
        test.setCircles(circles1);
        System.out.println(test.toString());
    }
}
