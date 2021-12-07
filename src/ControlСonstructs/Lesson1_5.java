package ControlСonstructs;

/**
 * 5. По введенному номеру определить цвет радуги (1 –
 * красный, 4 – зеленый и т. д.)
 */

public class Lesson1_5 {
    public static void main(String[] args) {
        System.out.println("Start");

        int rainbow = 6; // создаем переменую colour - тип int и присваеваем ему значение = 6
        String colour; // переменая типа String
        switch (rainbow) {
            case 1:
                colour = "red";
                break;
            case 2:
                colour = "orange";
                break;
            case 3:
                colour = "yollow";
                break;
            case 4:
                colour = "green";
                break;
            case 5:
                colour = "blue";
                break;
            case 6:
                colour = "indigo";
                break;
            case 7:
                colour = "violev";
                break;
            default:
                colour = "not a rainbow";
        }
        System.out.println(colour);
    }
}
