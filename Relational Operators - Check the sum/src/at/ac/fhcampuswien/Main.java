package at.ac.fhcampuswien;

/*
Write a program that reads the numbers a, b, c and checks if any pair of them sums to 20.

        The program must output true or false.

        Sample Input 1:

        1 2 3
        Sample Output 1:

        false
        Sample Input 2:

        4 16 7
        Sample Output 2:

        true*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum1 = a + b;
        int sum2 = a + c;
        int sum3 = b + c;
        if(sum1 == 20 || sum2 == 20 || sum3 == 20){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
