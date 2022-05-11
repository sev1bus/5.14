package com.company;
import java.util.Scanner;
public class Завдання3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);

        System.out.println("Запишіть підмети і присудки ");

        System.out.println("Запишіть перший дріб: ");
        int a1 = s1.nextInt();
        int a2 = s2.nextInt();
        if (a1 < a2) {
            System.out.println("Перший дріб правильний: ");
        }
        else
            System.out.println("Ви ввели не правильний дріб!");


        System.out.println("Запишіть другий дріб: ");
        int a3 = s3.nextInt();
        int a4 = s4.nextInt();
        if (a3 < a4) {
            System.out.println("Другий дріб правильний: ");
        }
        else
            System.out.println("Ви ввели не правильний дріб!");


        System.out.println("Запишіть третій дріб: ");
        int a5 = s5.nextInt();
        int a6 = s6.nextInt();
        if (a5 < a6) {
            System.out.println("Третій дріб правильний: ");}

        else
            System.out.println("Ви ввели не правильний дріб!");

        int n1, n2, n3;
        n1 = a1/a2;
        n2 = a3/a4;
        n3 = a5/a6;

        if (n1 > n2 && n1 > n3){
            System.out.println("Перший дріб найбільший");
        }
        if (n2 > n1 && n2 > a3){
            System.out.println("Другий дріб найбільший");
        }
        if (a3 > a1 && a3 > a2){
            System.out.println("Третій дріб найбільший");
        }
        else{
            System.out.println("Ви зробили щось не так");
        }
    }
}
