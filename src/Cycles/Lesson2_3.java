package Cycles;

import java.util.Scanner;

/**
 * 3. Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */

public class Lesson2_3 {
    public static void main(String[] args) {
        System.out.println("Start");
/**
 * Scanner - это класс, с помощью new создаем новый объект класса Scanner
 * Источник данных для сканера не только строка но и консоль.
 */
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число :");

        int summ = 0;
        int number = s.nextInt(); // int - это переменная типа int, имя переменной number
        for (int i = 1; i <= number; i++) {

            summ = summ + i;

        }
        System.out.println("summ="+ summ);
    }
}
