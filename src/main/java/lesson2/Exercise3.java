package lesson2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number1 = scanner.nextInt();

        if (number1 > 0) {
            number1 += 1;
        } else if (number1 < 0) {
            number1 -= 2;
        } else { // number == 0
            number1 = 10;
        }

        System.out.println("Полученное число: " + number1);

        scanner.close();
    }
}
