package at.ac.fhcampuswien;

/*Print the sum of all integers from a to b including both.

        It is guaranteed that a < b in all test cases.

        Sample Input 1:

        3
        22
        Sample Output 1:

        250*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i >= a && i <= b; i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
