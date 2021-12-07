package ControlСonstructs;

import java.util.Scanner;

/**
 * 4. Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */

public class Lesson1_4 {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("temperature");
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();//считываем консоль и записываем в переменую t

        if (t > -5) {
            System.out.println("warmly");
        } else if (-5 >= t && t > -20) {
            System.out.println("fine");
        } else if (-20 >= t) {
            System.out.println("cold");
        }
    }
}

