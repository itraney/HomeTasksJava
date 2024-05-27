package lesson2;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите 2 число: ");
        double b = scanner.nextDouble();

        if (a > b) {
        System.out.println("Болшее число: " + a);
        } else {
            System.out.println("Болшее число: " + b);
        }
    }
}