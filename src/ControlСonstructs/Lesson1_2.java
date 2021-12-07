package ControlСonstructs;

import java.util.Scanner;

/**
 * 2. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор if-else-if.
 */

public class Lesson1_2 {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("input month");
        Scanner scanner = new Scanner(System.in);
        int g;
        g = scanner.nextInt();

        if (g == 12 || g == 1 || g == 2) {
            System.out.println("Winter");
        } else if (g == 3 || g == 4 || g == 5) {
            System.out.println("Spring");
        } else if (g == 6 || g == 7 || g == 8) {
            System.out.println("Summer");
        } else if (g == 9 || g == 10 || g == 11) {
            System.out.println("Autumn");
        }
        System.out.println("and");
    }
}

