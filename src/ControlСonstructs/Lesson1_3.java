package ControlСonstructs;

/**
 * 3. Напишите программу которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
 * Для определения четности числа используйет операцию получения остатка от деления - операция выглядит так: '% 2').
 */

public class Lesson1_3 {
    public static void main(String[] args) {
        System.out.println(getResult(127));
    }

    static String getResult(int number){
        if (number % 2 == 0){
            return "Четное";
        }else {
            return "Не четное";
        }

    }
}
