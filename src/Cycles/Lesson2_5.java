package Cycles;

/**
 * 5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */

public class Lesson2_5 {
    public static void main(String[] args) {
        System.out.println("Start");

        for (int i = 0; i >= -45; i = i + (- 5)) {
            System.out.println("Число :" + i);
        }
    }
}
