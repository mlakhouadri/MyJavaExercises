package at.ac.fhcampuswien;

import java.util.Scanner;

Y/*ou have a guest list of the people who registered their stay at the hotel. There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests. The guest list consists of 4 lines. Each line contains the name or the names of the guests registered together in one room.

        Read the names of the registered guests from the list and output each name in a separate line and in reverse order starting with the last registered guest. Note that the order of the guests registered in each room is undefined.

        Sample Input 1:

        Jane Kate
        John
        Mary Susan Paul
        Boris Ann
        Sample Output 1:

        Ann
        Boris
        Paul
        Susan
        Mary
        John
        Kate
        Jane*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String room11;
        String room12;
        String room2;
        String room31;
        String room32;
        String room33;
        String room41;
        String room42;

        room11 = scanner.next();
        room12 = scanner.next();
        room2 = scanner.next();
        room31 = scanner.next();
        room32 = scanner.next();
        room33 = scanner.next();
        room41 = scanner.next();
        room42 = scanner.next();

        System.out.println(room42);
        System.out.println(room41);
        System.out.println(room33);
        System.out.println(room32);
        System.out.println(room31);
        System.out.println(room2);
        System.out.println(room12);
        System.out.println(room11);
    }
}

