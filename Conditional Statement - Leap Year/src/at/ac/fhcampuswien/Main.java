package at.ac.fhcampuswien;

/*
Find whether the given year is a leap year.

        Just a reminder: leap years are those years in which the year’s number is either divisible by 4, but not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).

        The program should work correctly for the years 1900 ≤ n ≤ 3000.

        Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.

        It is enough to write a simple conditional statement to solve this task.

        Sample Input 1:

        2100
        Sample Output 1:

        Regular
        Sample Input 2:

        2000
        Sample Output 2:

        Leap*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int possibleYear = 0;
        if(year >= 1900 && year <= 3000) {
            possibleYear = year;
        } if ((possibleYear % 4 == 0 && possibleYear % 100 != 0) || possibleYear % 400 == 0) {
            System.out.print("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}
