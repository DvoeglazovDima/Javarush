package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        do {
            System.out.println(a);
            b--;
        }
        while (0 < b && b < 4);
        //напишите тут ваш код

    }
}