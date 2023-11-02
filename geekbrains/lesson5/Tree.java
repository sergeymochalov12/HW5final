package geekbrains.lesson5;

import java.io.File;
/*
Класс Tree в представленном коде представляет собой утилиту для отображения дерева директорий и файлов в консоли.
Класс имеет один статический метод print, который принимает объект File
(представляющий директорию или файл), строку indent (для форматирования отступов) и флаг isLast, у
казывающий, является ли текущий элемент последним в списке.

Этот класс позволяет пользователю визуально увидеть структуру директорий и файлов в виде дерева,

 */
public class Tree {

    static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null)
            return;

        int subDirTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory())
                subDirTotal++;
        }

        int subDirCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirCounter++;
                print(files[i], indent, subDirCounter == subDirTotal);
            }
        }
        // Цикл для файлов
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.print(indent);
                System.out.print((i == files.length - 1) ? "└─" : "├─");
                System.out.println(files[i].getName());
            }
        }

    }
}
