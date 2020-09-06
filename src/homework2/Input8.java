package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Input8 {
    public static void main(String[] args) {
        int[] cifr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = cifr[0];
        int pozsum = 0;
        int otrizsum = 0;
        int poznumb = 0;
        int middlsum = 0;
        int numbsum = 0;
        for (int i = 0; i < cifr.length; i++) {
            int abc = cifr[i];
            if (max < abc) {
                max = abc;
            }
            if (abc > 0) {
                pozsum = pozsum + abc;
            }
            if (abc < 0 && abc % 2 == 0) {
                otrizsum = otrizsum + abc;
            }
            if (abc > 0) {
                poznumb = poznumb + 1;
            }
            if (abc < 0) {
                numbsum = numbsum + 1;
                middlsum = ((middlsum + abc) / numbsum);
            }
            System.out.println("Максимальное значение: " + max);
            System.out.println("Сумма положительных чисел: " + pozsum);
            System.out.println("Сумма отрицательных четных чисел: " + otrizsum);
            System.out.println("Количество положительных чисел: " + poznumb);
            System.out.println("Среднее арифметическое отрицательных чисел: " + middlsum );
        }
    }
}

