package org.yup;

import java.io.*;
import java.util.Scanner;

public class BedtimeStoriesApp {

    public static void main(String[] args) {

        try {

            System.out.println("What story would you like to hear tonight?");
            System.out.println("Enter G for Goldilocks, M for Mary had a Little Lamb or H for Hansel and Gretel");

            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            String story = switch (choice.toUpperCase()) {
                case "G" -> "goldilocks.txt";
                case "M" -> "mary_had_a_little_lamb.txt";
                case "H" -> "hansel_and_gretel";
                default -> "";
            };

            FileInputStream file = new FileInputStream(story);

            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {

                System.out.println(fileScanner.nextLine());

            }

            fileScanner.close();

        } catch (IOException e){
            System.out.println("Sorry, I don't know that story yet. Please choose G, M, or H.");
            e.printStackTrace();
        }

    }

}