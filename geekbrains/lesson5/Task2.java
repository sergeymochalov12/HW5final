package geekbrains.lesson5;

import java.io.File;

public class Task2 {

    public static void main(String[] args){

        Tree tree = new Tree();
        tree.print(new File("."), "", true);
    }


}