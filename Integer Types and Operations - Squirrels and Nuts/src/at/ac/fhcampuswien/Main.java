package at.ac.fhcampuswien;

import java.util.Scanner;

/*N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.

        Input data format

        There are two positive integers N and K, each of them is not greater than 10000.

        Sample Input 1:

        3
        14
        Sample Output 1:

        2*/


public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n;
	int k;
	int remainder;

	n = scanner.nextInt();
	k = scanner.nextInt();

	if(n <= 10_000 && k <= 10_000){
		remainder = k % n;
	    System.out.print(remainder);
    }
    }
}
