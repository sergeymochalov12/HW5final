package geekbrains.lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Backup {

    public static void main(String[] args) {
        String path = "C:\\HW5\\geekbrains\\lesson5";
        String backup = "C:\\backup";

        File sourceDir = new File(path);
        backupDirectory(sourceDir, backup);
        System.out.println("В директории " +backup + " создан архив всех файлов из директории " + path);
    }

    public static void backupDirectory(File sourceDir, String backupPath) {
        System.out.println("Проверка пути: " + sourceDir.getAbsolutePath());
        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            System.out.println("Указанный путь не является директорией или не существует.");
            return;
        }

        File backupDir = new File(backupPath);
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        for (File file : sourceDir.listFiles()) {
            if (file.isFile()) {
                copyFile(file, new File(backupDir, file.getName()));
            }
        }
    }

    public static void copyFile(File source, File dest) {
        try {
            if (!dest.exists()) {
                dest.createNewFile();
            }

            try (FileChannel sourceChannel = new FileInputStream(source).getChannel();
                 FileChannel destChannel = new FileOutputStream(dest).getChannel()) {
                destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

