package homework2;

import java.util.Scanner;

public class Input10 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb10 = scan.nextInt();
        System.out.println("Ваше число: " + numb10 % -2);
    }
}