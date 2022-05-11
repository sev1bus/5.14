package com.company;
import java.util.Scanner;
public class Завдання4 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("Запишіть 2 слова: ");
        String f1 = s1.nextLine();
        String f2 = s2.nextLine();

        System.out.println(f1.equals(f2));
    }
}