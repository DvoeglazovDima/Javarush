package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // Считываем имя файла с консоли
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());

        // Читаем все строки из файла
        List<String> lines = Files.readAllLines(filePath);

        // Выводим строки через одну, начиная с первой
        for (int i = 0; i < lines.size(); i += 2) {
            System.out.println(lines.get(i));//напишите тут ваш код
        }
    }
}

