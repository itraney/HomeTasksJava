package Lesson1;

import java.util.Scanner;

public class HelloWorldAndName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name = in.next();

        System.out.printf("Hello World " + name);
        in.close();
    }
}
