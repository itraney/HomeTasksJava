package lesson2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter number: ");
        int numberX = in.nextInt();

        //Проверка на валидность данных в диапозоне
       if (numberX < -999 || numberX > 999) {
           System.out.println("Invalid input. Please enter a number between -999 and 999");
       //Проверка основных сценариев
       } else {
           if (numberX < -99) {
               System.out.println("Трехзначное отрицательное");
           } else if (numberX >= -99 && numberX <= -10) {
               System.out.println("Двузначное отрицательное");
           } else if (numberX > -10 && numberX < 0) {
               System.out.println("Однозначное отрицательное");
           } else if (numberX == 0) {
               System.out.println("Ноль");
           } else if (numberX > 99) {
               System.out.println("Трехзначное положительное");
           } else if (numberX > 9 && numberX <= 99) {
               System.out.println("Двузначное положительное");
           } else if (numberX >= 0 && numberX <= 9) {
               System.out.println("Однозначное положительное");
           }
       }
        in.close();
    }
}