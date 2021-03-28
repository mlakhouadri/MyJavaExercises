package at.ac.fhcampuswien;

/*
Write a program that reads three numbers and checks that they all are different, i.e. not equal to one another.

        The output should be true or false.

        Sample Input 1:

        5 5 9
        Sample Output 1:

        false*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumb = scanner.nextInt();
        int secondNumb = scanner.nextInt();
        int thirdNumb = scanner.nextInt();
        if (firstNumb != secondNumb && firstNumb != thirdNumb && secondNumb != thirdNumb) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
