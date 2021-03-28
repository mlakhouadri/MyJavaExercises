package at.ac.fhcampuswien;

/*
Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).

        Otherwise, it should print false.

        Sample Input 1:

        1 1 1
        Sample Output 1:

        false
        Sample Input 2:

        1 0 -1
        Sample Output 2:

        true*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumb = scanner.nextInt();
        int secondNumb = scanner.nextInt();
        int thirdNumb = scanner.nextInt();
        if (firstNumb > 0 && secondNumb <= 0 && thirdNumb <= 0 || firstNumb <= 0 && secondNumb > 0 && thirdNumb <= 0 || firstNumb <= 0 && secondNumb <= 0 && thirdNumb > 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
