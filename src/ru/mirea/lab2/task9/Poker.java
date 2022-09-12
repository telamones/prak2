package ru.mirea.lab2.task9;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    private static String[] cardRang = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] cardSuit = {"clubs", "diamonds", "hearts", "spades"};

    public static String generateCard() {
        Random generator = new Random();
        int randomIndexRang = generator.nextInt(cardRang.length);
        int randomIndexSuit = generator.nextInt(cardSuit.length);
        return cardRang[randomIndexRang] + cardSuit[randomIndexSuit] + " ";
    }

    public static void main (String[] argc) {
        System.out.print("enter number of players: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n+1; i++) {
            System.out.println("\n\n" + i + " player");
            for (int j = 0; j < 5; j++) {
                System.out.print(generateCard());
            }
        }
    }

}
