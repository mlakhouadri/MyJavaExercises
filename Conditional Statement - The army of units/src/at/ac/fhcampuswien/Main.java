package at.ac.fhcampuswien;

/*
In a computer game, each gamer has an army of units.

        Write a program that will classify the army of your enemies corresponding to the following rules:

        Units: Category

        less than 1: no army

        from 1 to 19: pack

        from 20 to 249: throng

        from 250 to 999: zounds

        1000 and more: legion

        The program should read the number of units and output the corresponding category.

        Sample Input 1:

        5
        Sample Output 1:

        pack
        Sample Input 2:

        303
        Sample Output 2:

        zounds
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 1) {
            System.out.print("no army");
        } else if (input >= 1 && input <= 19) {
            System.out.print("pack");
        } else if (input >= 20 && input <= 249) {
            System.out.print("throng");
        } else if (input >= 250 && input <= 999) {
            System.out.print("zounds");
        } else if (input >= 1000) {
            System.out.print("legion");
        }
    }
}
