package at.ac.fhcampuswien;

/*
Write a program that reads two lines and compares them without whitespaces. The program should prints true if both lines are equal, otherwise – false.

        Sample Input 1:

        string
        str ing
        Sample Output 1:

        true
        Sample Input 2:

        string
        my string
        Sample Output 2:

        false*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        String string3 = string1.replaceAll(" ", "").trim();
        String string4 = string2.replaceAll(" ", "").trim();

        if (string4.equals(string3)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

