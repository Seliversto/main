package homework2;

import java.util.Scanner;

public class Input1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb1 = scan.nextInt();
        int cifr1 = numb1 % 10;
        System.out.println("Ваше число: " + cifr1);
    }
}
