package Cycles;

/**
 * 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */

public class Lesson2_6 {
    public static void main(String[] args) {
        System.out.println("Start");

        int i = 3; // возводимое в степень число
        int r = 1; // результат возведения в степень
        int s = 10; // условие входа на цикл
        while (s <= 20) {//условие входа в цикл
            r = r * i;
            System.out.println(i + " степень " + s + " = " + r);
            s++;

        }
    }
}
