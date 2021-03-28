package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.

        Sample Input 1:

        320
        Sample Output 1:

        23
        Sample Input 2:

        976
        Sample Output 2:

        679*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );

        int n = scanner.nextInt();
        int rev = 0;
        while (n!= 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.print(rev);
    }
}