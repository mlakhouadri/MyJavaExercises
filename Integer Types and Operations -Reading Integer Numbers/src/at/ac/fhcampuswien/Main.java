package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Write a program that reads four integer numbers from one line and prints them each in a new line. In the input line numbers are separated by one or more spaces.

        Sample Input 1:

        101    102 103  104
        Sample Output 1:

        101
        102
        103
        104*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1;
        int numb2;
        int numb3;
        int numb4;

        numb1 = scanner.nextInt();
        numb2 = scanner.nextInt();
        numb3 = scanner.nextInt();
        numb4 = scanner.nextInt();

        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(numb3);
        System.out.print(numb4);

    }
}
