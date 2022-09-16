package ru.mirea.lab2.task3;

public class Tester {
    private static int n=5;
    private static Circle[] circles = new Circle[n];


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
        String str="";
        for (int i=0; i<5; i++) {
            str+=this.circles[i].toString();
        }
        return str;
    }


    public static void main(String[] args) {
        Circle[] circles1 = new Circle[5];
        for (int i = 0; i < 5; i++) {
            circles1[i] = new Circle();
        }
        Tester test = new Tester();
        test.setCircles(circles1);
        System.out.println(test.toString());
    }
}
