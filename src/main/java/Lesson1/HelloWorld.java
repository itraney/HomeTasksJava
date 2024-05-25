package Lesson1;

import java.io.Console;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String name = in.next();

        System.out.printf("Hello World " + name);
        in.close();

//        String name;
//        Console con = System.console();
//        name = con.readLine("Please, enter your name: ");
//        System.out.println("Hello World, " + name);
    }
}
