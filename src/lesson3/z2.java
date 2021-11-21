package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class z2 {

    public static void main(String[] args) {


        System.out.println("Result: " + Arrays.toString(Array()));

    }

    public static int[] Array() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int size = scanner.nextInt();
        int[] Array = new int[size];

        for (int i = 0; i < Array.length; i++) {
            System.out.println("Numbers of array: ");
            Array[i] = scanner.nextInt();
        }
        return Array;
    }
}
