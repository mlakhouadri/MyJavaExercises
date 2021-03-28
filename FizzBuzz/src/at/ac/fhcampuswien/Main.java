package at.ac.fhcampuswien;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int interval = input1;
        //System.out.println(input1);

        for (int i = input1; i <= input2; i++) {

            if ((interval) % 3 == 0 && (interval) % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (interval % 3 == 0) {
                System.out.println("Fizz");
            } else if (interval % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(interval);

            }
            interval++;
        }
    }
}