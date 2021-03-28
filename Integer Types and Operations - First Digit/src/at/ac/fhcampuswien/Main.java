package at.ac.fhcampuswien;

import java.util.Scanner;

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
