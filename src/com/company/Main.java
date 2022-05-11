package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);


        System.out.println("Введіть речення з п'яти слів (Введіть по одному слову в кожному рядку): ");
        System.out.print(s1.nextLine().concat (" "+s2.nextLine()).concat (" "+s3.nextLine()).concat (" "+s4.nextLine()).concat(" "+s5.nextLine()));
    }
}


