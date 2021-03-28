package at.ac.fhcampuswien;

/*
Write a program that reads three integer numbers and prints true if the first number is between the second and the third one (inclusive). Otherwise, it must print false.

        The sorting order of two last arguments can be any.
        Sample Input 1:

        3 3 3
        Sample Output 1:

        true
        Sample Input 2:

        2 7 9
        Sample Output 2:

        false
        Sample Input 3:

        40 100 20
        Sample Output 3:

        true
        Sample Input 4:

        2 1 3
        Sample Output 4:

        true*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumb = scanner.nextInt();
        int secondNumb = scanner.nextInt();
        int thirdNumb = scanner.nextInt();
        if (firstNumb >= secondNumb && firstNumb <= thirdNumb || firstNumb <= secondNumb && firstNumb >= thirdNumb){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
