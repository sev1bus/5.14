package com.company;
import java.util.Scanner;
public class Завдання2 {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);

        System.out.println("Введіть повну назву свого навчального закладу або робочого місця : ");
        System.out.print("Абревіатура: "+s1.nextLine().substring(0,1) + s2.nextLine().substring(0,1)+s3.nextLine().substring(0,1)+s4.nextLine().substring(0,1)+s5.nextLine().substring(0,1)+s6.nextLine().substring(0,1));
    }
}