package com.javarush.task.pro.task15.task1510;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("No input provided in args");
            return;
        }

        byte[] bytes = args[0].getBytes(); // Преобразуем строку из аргументов в массив байтов
        try (Scanner scanner = new Scanner(System.in);
             OutputStream outputStream = Files.newOutputStream(Path.of(scanner.nextLine()))) {
            outputStream.write(bytes); // Записываем байты в файл
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
