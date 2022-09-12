package ru.mirea.lab2.task1;

import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author ("Misha", "misha@mail.ru", 'm');
        System.out.println(a1.toString());
        Scanner sc = new Scanner(System.in);
        System.out.print("enter new email: ");
        a1.setEmail(sc.nextLine());
        System.out.println("name: " + a1.getName() + "; email: " + a1.getEmail() + "; gender: " + a1.getGender());
    }
}
