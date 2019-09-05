package Question_4;

import java.util.Scanner;
import java.util.Arrays;

public class question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of cells n: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of array " + i + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Old array: " + Arrays.toString(a));

        double min = a[0];
        double imin = 0;
        for (int i = 0; i < n; i++) {
            if (min > a[i])
                min = a[i];

        }
        System.out.println("Min: " + min);

        double max = a[0];
        double imax = 0;
        for (int i = 0; i < n; i++) {
            if (max < a[i])
                max = a[i];

        }
        System.out.println("Max: " + max);

        imax = max;
        imin = min;

        for (int i = 0; i < n; i++) {
            if (a[i] == imax) {
                a[i] = imin;
            } else if (a[i] == imin) {
                a[i] = imax;
            }
        }
        System.out.println("New array: " + Arrays.toString(a));
    }
}




















