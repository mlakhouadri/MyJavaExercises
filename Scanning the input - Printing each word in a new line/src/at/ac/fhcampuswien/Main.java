package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that reads five words from the standard input and outputs each word in a new line. The words should be in the same order.

        Sample Input 1:

        This Java platform
        is adaptive
        Sample Output 1:

        This
        Java
        platform
        is
        adaptive*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );

        String line1;
        String line2;
        String line3;
        String line4;
        String line5;

        line1 = scanner.next ();
        line2 = scanner.next ();
        line3 = scanner.next ();
        line4 = scanner.next ();
        line5 = scanner.next ();

        System.out.println ( line1 + "\n" + line2 + "\n" + line3 );
        System.out.println ( line4 + "\n" + line5 );
    }
}