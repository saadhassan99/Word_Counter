package com.saadhassan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        intro();
        File file = paper();
        String paperPath = file.getPath();
        wordsCounter(paperPath);
        charactersCounter(paperPath);
        linesCounter(paperPath);

    }

    public static void intro(){
        System.out.println("Welcome to the counter");
        System.out.println("Submit your paper and I can count the total number of " +
                "\nwords, characters and sentences in your paper");
        System.out.println("NOTE: The file should only be a text file ");
    }

    public static File paper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please copy and paste the path of the paper from your computer here");

        File file = new File(scanner.nextLine());

        while (!file.exists()){

            System.out.println("File does not exist. Please check your path and file name and try again");
            file = new File(scanner.nextLine());

        }

        return file;
    }
    public static void wordsCounter(String paperPath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(paperPath));
        int counter = 0;
        while (scanner.hasNext()){
            String words = scanner.next();
            counter++;
        }
        System.out.println("Total number of words are = " + counter);
    }

    public static void charactersCounter(String paperPath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(paperPath));
        int counter = 0;
        while (scanner.hasNext()){
            String word = scanner.next();
            counter += word.length();
        }
        System.out.println("Total number of characters are = " + counter);
    }

    public static void linesCounter(String paperPath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(paperPath));
        int counter = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            counter++;
        }
        System.out.println("Total number of lines are = " + counter);
    }

}
