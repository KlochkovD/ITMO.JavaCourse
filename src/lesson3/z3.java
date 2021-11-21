package lesson3;

import java.util.Arrays;

public class z3 {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(Array));
        int temp = Array[0];
        Array[0] = Array[Array.length-1];
        Array[4] = temp;
        System.out.println(Arrays.toString(Array));
    }
}




