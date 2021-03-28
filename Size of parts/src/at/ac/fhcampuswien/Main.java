package at.ac.fhcampuswien;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int input = 0;
        int small = 0;
        int perfect = 0;
        int large = 0;
        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            if (input == 0) {
                perfect++;
            } else if (input == 1) {
                large++;
            } else if (input == -1) {
                small++;

            }

        }
        System.out.println(perfect + " " + large + " " + small);
    }

}