package ru.mirea.lab2.task10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.print("enter line: ");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            int count = 1;
            String line = sc.nextLine();
            for (int i=0; i<line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.printf("you enter %s words", count);
        }
        else {
            System.out.print("you don't enter line");
        }
    }
}
