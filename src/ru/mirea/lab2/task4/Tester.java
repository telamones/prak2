package ru.mirea.lab2.task4;

public class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop(10);
        Computer comp1 = new Computer("win", 85000, 2018);
        Computer comp2 = new Computer("mac", 110000, 2020);
        Computer comp3 = new Computer("win", 170000, 2022);
        shop.add (comp1);
        shop.add (comp2);
        shop.add (comp3);
        //shop.delete(2);
        System.out.println(shop.toString());
    }
}
