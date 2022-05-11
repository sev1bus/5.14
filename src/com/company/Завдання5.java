package com.company;
import java.util.Scanner;
public class Завдання5 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("Запишіть 2 слова: ");
        String a1 = s1.nextLine();
        String a2 = s2.nextLine();

        System.out.println(a1.length());
        System.out.println(a2.length());
        if(a1.length() > a2.length()){
            System.out.println("В першому елементі більше символів.");
        }
        else {
            System.out.println("В другому елементі більше символів.");
        }
    }
}