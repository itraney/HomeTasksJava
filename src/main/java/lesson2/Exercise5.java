package lesson2;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число програмистов: ");
        long a = scanner.nextLong();

        System.out.print("Введите 2 число програмистов: ");
        long b = scanner.nextLong();

        long maxCount = Math.max(a, b);

        String ending;
        if (maxCount % 10 == 1 && maxCount % 100 != 11) {
            ending = "программист";
        } else if (maxCount % 10 >= 2 && maxCount % 10 <= 4 && (maxCount % 100 < 10 || maxCount % 100 >= 20)) {
            ending = "программиста";
        } else {
            ending = "программистов";
        }
            System.out.println(maxCount + " " + ending);

        scanner.close();
    }
}