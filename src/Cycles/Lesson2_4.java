package Cycles;

/**
 * 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 * В решении используйте цикл while.
 */

public class Lesson2_4 {
    public static void main(String[] args) {
        System.out.println("Start");

        int i = 7; // int - это переменная типа int, имя переменной i ( = присвоен) 7.
        while (i <= 98) { // while - это (цикл) многократного выполнения действия
            System.out.println("Число:" + i);
            i = i + 7;

        }
    }
}
