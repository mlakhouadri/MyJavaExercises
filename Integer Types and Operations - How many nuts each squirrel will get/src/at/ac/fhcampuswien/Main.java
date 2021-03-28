package at.ac.fhcampuswien;

import java.util.Scanner;

/*N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.

        Input data format

        There are two positive numbers N and K, each of them is not greater than 10000.

        Sample Input 1:

        3
        14
        Sample Output 1:

        4*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;

        n = scanner.nextInt();
        k = scanner.nextInt();

        if(n <= 10_000 && k <= 10_000){
        System.out.print(k / n);
        }
    }
}
