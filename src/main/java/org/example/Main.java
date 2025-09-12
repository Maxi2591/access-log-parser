package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        int sum =  firstNumber+secondNumber;
        int raz =  firstNumber-secondNumber;
        int prz = firstNumber*secondNumber;
        double cha = (double) firstNumber/secondNumber;
        System.out.println("Результат:");
        System.out.println(sum);
        System.out.println(raz);
        System.out.println(prz);
        System.out.println(cha);
    }
}