package at.ac.fhcampuswien;

/*
Write a program that reads a value and checks if it is less than 10.

        Sample Input 1:

        5
        Sample Output 1:

        true*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 10){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
