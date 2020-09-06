package homework2;

import java.util.Scanner;

public class Input4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb4 = scan.nextInt();
        System.out.println("Ваше число: " + plus4(numb4));
    }

    public static int plus4(int numb4) {
        if (numb4 > 0) {
            return numb4 + 1;
        } else if (numb4 < 0) {
            return numb4 - 2;
        } else {
            return 10;
        }
    }
}