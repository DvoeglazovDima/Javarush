package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = 0;
        boolean b = false;
        while (!b) {
            if (console.hasNextInt()) {
                int number = console.nextInt();
                a = a + number;
            } else if (console.hasNextLine()) {
                String line = console.nextLine();
                if (line.equals("ENTER")) {
                    b = true;
                }
            }
        }
        System.out.println(a);
    }//напишите тут ваш код

}
