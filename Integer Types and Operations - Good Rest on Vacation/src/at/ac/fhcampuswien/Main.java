package at.ac.fhcampuswien;

import java.util.Scanner;

/*Write a program that will help people who are going on vacation. The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.

        There are four parameters which have to be considered:
        duration in days
        total food cost per a day
        one-way flight cost
        cost of one night in a hotel (the number of nights equal duration minus one)
        Read values of these parameters from the standard input and then print the result.

        Hint
        Sample Input 1:

        7 30 100 40
        Sample Output 1:

        650*/

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int duration;
	int food;
	int flight;
	int night;

	duration = scanner.nextInt();
	food = scanner.nextInt();
	flight = scanner.nextInt();
	night = scanner.nextInt();

	System.out.print((duration * food) + (flight * 2) +  ((duration - 1) * night));
    }
}
