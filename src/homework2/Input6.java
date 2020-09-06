package homework2;

import javax.swing.*;
import java.util.Scanner;

public class Input6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        System.out.println("Характеристика числа: " + chetnoeorno(a) + " " + plusorno(a));
    }

    public static String plusorno(int a) {
        if (a < 0) {
            return "отрицательное";
        } else if (a > 0) {
            return "положительное";
        } else {
            return "нулевое";
        }
    }

    public static String chetnoeorno(int a) {
        if (a == 0) {
            return "";
        }
        if (a % 2 == 0) {
            return "четное";
        } else {
            return "нечетное";
        }
    }
}
