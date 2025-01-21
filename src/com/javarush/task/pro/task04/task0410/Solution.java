package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
       Scanner cnsl = new Scanner(System.in);
        int min2 = Integer.MAX_VALUE;
        int min1 = min2-1;

        while (cnsl.hasNextInt()) {
            int x = cnsl.nextInt();
            if (x < min1) {
                min2 = min1;
                min1=x;
            }

            if (x > min1 && min2 > x)
                min2 = x;
        }

        System.out.println(min2); //напишите тут ваш код

    }
}