package at.ac.fhcampuswien;

import java.util.Scanner;

/*Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

        Sample Input 1:

        476
        Sample Output 1:

        17*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum;
        n = scanner.nextInt();
        if (n >= 100 && n <= 999){
            sum = (n / 100 % 10) + (n / 10 % 10) + (n / 1 % 10);
            System.out.print(sum);
        }
    }
}
