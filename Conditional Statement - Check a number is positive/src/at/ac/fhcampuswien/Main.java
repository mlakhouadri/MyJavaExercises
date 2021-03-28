package at.ac.fhcampuswien;

/*
Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.

        Do not forget that zero is not a positive number.

        Sample Input 1:

        7
        Sample Output 1:

        YES*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
