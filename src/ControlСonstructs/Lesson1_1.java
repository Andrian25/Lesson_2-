package ControlСonstructs;

/**
 * 1. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */

public class Lesson1_1 {
    public static void main(String[] args) {
        System.out.println("Start");

        int month = 4;//создаем переменную month - типа инт и присваеваем значение = 4
        String season;// переменая типа стринг
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Not a Month";
        }
        System.out.println(season);
    }

}
