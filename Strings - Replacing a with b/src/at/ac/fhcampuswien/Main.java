package at.ac.fhcampuswien;

/*
Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.

        The program should print out the resulting string.

        Sample Input 1:

        aaa
        Sample Output 1:

        bbb
        Sample Input 2:

        bca
        Sample Output 2:

        bcb*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = input.replaceAll("a", "b");
        System.out.println(result);
    }
}
