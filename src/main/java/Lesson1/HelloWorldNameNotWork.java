package Lesson1;

import java.io.Console;

public class HelloWorldNameNotWork {
    static String name = "";

    public static void main(String args []) {
        String name;
        Console con = System.console();
        name = con.readLine("Please, enter your name: "); //при запуске ругается на эту строку con == null
        System.out.println("Hello World, " + name);
    }
}
