package ru.mirea.lab2.task5;
import java.util.Scanner;

public class DogHouse {
    public static void main(String[] args) {
        Dog[] house = new Dog[5];
        house[0] = new Dog("Max", 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("how much new dogs?");
        int n = sc.nextInt()+1;
        for (int i=1; i < n; i++) {
            System.out.println("enter name and age: ");
            house[i] = new Dog(sc.next(), sc.nextInt());
        }
        int i=0;
        while (i<n) {
            System.out.println(house[i].toString());
            i++;
        }
    }
}
