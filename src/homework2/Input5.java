package homework2;

import java.util.Scanner;

public class Input5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Минимальное число: " + min((a), min(b, c)));
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else
            return b;
        }
    }