package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.

        Hint

        Sample Input 1:

        1 2
        Sample Output 1:

        2 1*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int input1;
	    int input2;
	    input1 = scanner.nextInt();
	    input2 = scanner.nextInt();
	    System.out.print(input2);
	    System.out.print(" ");
	    System.out.print(input1);
    }
}
