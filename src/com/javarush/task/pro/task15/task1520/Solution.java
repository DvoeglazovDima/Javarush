package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        if (!Files.isDirectory(sourceDirectory)) {
            System.out.println("Исходная директория не существует или не является директорией.");
            return;
        }
        if (!Files.exists(targetDirectory)) {
            Files.createDirectories(targetDirectory);
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    Path targetFile = targetDirectory.resolve(entry.getFileName());
                    Files.move(entry, targetFile);
                }
            }
        }
    }
}