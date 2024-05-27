package lesson2;

import java.util.Scanner;

public class Exercise2 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите длину стороны a: ");
    double a = scanner.nextDouble();

    System.out.print("Введите длину стороны b: ");
    double b = scanner.nextDouble();

    System.out.print("Введите длину стороны c: ");
    double c = scanner.nextDouble();

    boolean isTriangle =
            (a + b > c) && (a + c > b) && (b + c > a);

    if (isTriangle) {
        System.out.println("Треугольник существует.");
    } else {
        System.out.println("Треугольник не существует.");
    }

    scanner.close();
}
}