package at.ac.fhcampuswien;

/*Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.

        You are given three numbers: AA, BB and HH. According to TV, one should sleep at least AA hours per day, but no more than BB hours. HH is how many hours Ann sleeps.

        Task: If Ann sleeps less then AA hours, print "Deficiency". If she sleeps more than BB hours, print "Excess". If her sleep fits the recommendations, print "Normal".

        Input format: three numbers AA, BB, HH, where AA is always less than or equal to BB.

        Hint

        Sample Input 1:

        6
        10
        8
        Sample Output 1:

        Normal
        Sample Input 2:

        7
        9
        10
        Sample Output 2:

        Excess
        Sample Input 3:

        7
        9
        2
        Sample Output 3:

        Deficiency*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atLeast = scanner.nextInt();
        int notMore = scanner.nextInt();
        int actual = scanner.nextInt();
        if (atLeast <= notMore) {
            if (actual < atLeast) {
                System.out.print("Deficiency");
            } else if (actual > notMore) {
                System.out.print("Excess");
            } else if (actual > atLeast || actual < notMore) {
                System.out.print("Normal");
            } else {
                System.out.print("Out of range");
            }
        }
    }
}
