package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that reads four words and outputs them in the same order, each in a new line.

        Sample Input 1:

        Hello
        Java
        Future programmer
        Sample Output 1:

        Hello
        Java
        Future
        programmer*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1;
        String line2;
        String line31;
        String line32;

        line1 = scanner.nextLine();
        line2 = scanner.nextLine();
        line31 = scanner.next();
        line32 = scanner.next();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line31);
        System.out.print(line32);
    }
}