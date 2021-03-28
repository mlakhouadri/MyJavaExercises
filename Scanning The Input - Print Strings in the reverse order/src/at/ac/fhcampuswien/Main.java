package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that reads three strings and outputs them in the reverse order, each in a new line.
        Sample Input 1:

        Java
        Programming
        Language
        Sample Output 1:

        Language
        Programming
        Java*/

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1;
        String word2;
        String word3;

        word1 = scanner.next();
        word2 = scanner.next();
        word3 = scanner.next();

        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
    }
}


