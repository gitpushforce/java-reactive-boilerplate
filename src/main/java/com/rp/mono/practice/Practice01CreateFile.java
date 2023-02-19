package com.rp.mono.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Practice01CreateFile {
    public static void main(String[] args) {
        createFile();
    }

    private static Runnable createFile () {
        return () -> {
            Path path = Paths.get("/practice01.txt");
            try {
                Path p = Files.createFile(path);
                System.out.println("file created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    }
}
