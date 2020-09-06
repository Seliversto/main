package homework2;

import java.util.Scanner;

public class Input7 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int kod = scan.nextInt();
        System.out.println(cost(kod));
    }

    public static String cost(int a) {   // Sring - то, что буду сюда передавать по итогу, int - то, что ввожу
        if (a == 905) {
            return ("Москва. Стоимость разговора: " + (4.15 * 10));
        } else if (a == 194) {
            return ("Ростов. Стоимость разговора: " + (1.98 * 10));
        } else if (a == 491) {
            return ("Краснодар. Стоимость разговора: " + (2.69 * 10));
        } else if (a == 800) {
            return ("Киров. Стоимость разговора: " + ( 5.00 * 10));
        }
        return "0";
    }
}