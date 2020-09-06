package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Input9 {
    public static void main(String[] args) {
        int[] cifr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int[] cifr1 = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = cifr[0];
        int pozsum = 0;
        for (int i = 0; i < cifr.length; i++) {
            int abc = cifr[i];
            if (max < abc) {
                max = abc;
            }
            if (abc > 0) {
                cifr1[i] = 0;
                pozsum = pozsum + abc;
            }
        }
        System.out.println(max);
        System.out.println(pozsum);
        System.out.println(Arrays.toString(cifr1));
    }
}
