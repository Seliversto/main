package homework2;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb3 = scan.nextInt();
        System.out.println("Ваше число: " + plus3(numb3));
    }

    public static int plus3(int numb3) {
        if (numb3 > 0) {
            return numb3 + 1;
        } else {
            return numb3;
        }
    }
}