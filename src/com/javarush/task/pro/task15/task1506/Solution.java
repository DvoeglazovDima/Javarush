package com.javarush.task.pro.task15.task1506;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Чтение пути к файлу с консоли
            System.out.println("Введите путь к файлу:");
            Path filePath = Path.of(scanner.nextLine());

            // Построчное чтение файла с указанной кодировкой и удаление символов
            Files.lines(filePath, Charset.forName("windows-1251"))
                    .map(line -> line.replaceAll("[., ]", ""))
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Произошла ошибка при обработке файла: " + e.getMessage());
        }
    }
}
