package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ms = scanner.nextInt();
        int kms = (int) Math.round((ms * 1.0) * 3.6);//напишите тут ваш код
        System.out.println(kms);
    }
}