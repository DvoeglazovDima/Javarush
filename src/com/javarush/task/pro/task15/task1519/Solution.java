package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Считываем пути к исходной и целевой директориям
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        // Проверяем существование исходной директории
        if (!Files.isDirectory(sourceDirectory)) {
            System.out.println("Исходная директория не существует или не является директорией.");
            return;
        }

        // Проверяем или создаём целевую директорию
        if (!Files.exists(targetDirectory)) {
            Files.createDirectories(targetDirectory);
        }

        // Копируем файлы из исходной директории в целевую
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    Path targetFile = targetDirectory.resolve(entry.getFileName());
                    Files.copy(entry, targetFile);
                }
            }
        }
    }
}
