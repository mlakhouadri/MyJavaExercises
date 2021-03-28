package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that finds the number of tens in a non-negative integer N (0 ≤ N ≤ 1000000).

        Take a look at the examples:

        If N is 264, the number of tens is 6.

        If N is 4136, the number of tens is 3.

        If N is 101, the number of tens is 0.

        Sample Input 1:

        173
        Sample Output 1:

        7*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		int tens;
		n = scanner.nextInt();

		if (n >= 0 && n <= 1_000_000) {
			tens = n / 10 % 10;
			System.out.print(tens);
		}
	}
}