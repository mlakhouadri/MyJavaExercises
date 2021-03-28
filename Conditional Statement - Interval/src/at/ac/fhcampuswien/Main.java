package at.ac.fhcampuswien;

/*Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).

        Here are two types of brackets in the intervals:

        parenthesis () exclude the border number;
        and square brackets [] include the border number.
        Sample Input 1:

        20
        Sample Output 1:

        True
        Sample Input 2:

        -20
        Sample Output 2:

        False*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > -15 && input <= 12 || input > 14 && input < 17 || input >= 19) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
