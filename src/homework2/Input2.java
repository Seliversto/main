package homework2;

import java.util.Scanner;

public class Input2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb2 = scan.nextInt();
        int last = numb2 % 10;
        numb2 = numb2 / 10;
        int middle = numb2 % 10;
        int first = (numb2 - (numb2 % 10)) / 10;
        int sum = first + middle + last;
        System.out.println("Ваше число: " + sum);
    }
}