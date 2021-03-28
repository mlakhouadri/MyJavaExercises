package at.ac.fhcampuswien;

/*
Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric, output 1; otherwise output any other integer. The number may have less than four digits; in this case you should assume that its decimal notation is complemented by insignificant zeros on the left.

        Sample Input 1:

        2002
        Sample Output 1:

        1
        Sample Input 2:

        2008
        Sample Output 2:

        37*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String sub2 = input.substring(2, 4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sub2);
        stringBuilder = stringBuilder.reverse();
        String sub3 = input.substring(0, 2);
        if (sub3.contentEquals(stringBuilder)) {
            System.out.print("1");
        } else {
            System.out.print("37");
        }
    }
}