package lesson2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число програмистов: ");
        long a = scanner.nextLong();

        String ending;
        if (a % 10 == 1 && a % 100 != 11) {
            ending = "программист";
        } else if (a % 10 >= 2 && a % 10 <= 4 && (a % 100 < 10 || a % 100 >= 20)) {
            ending = "программиста";
        } else {
            ending = "программистов";
        }
        System.out.println(a + " " + ending);

        scanner.close();
    }
}