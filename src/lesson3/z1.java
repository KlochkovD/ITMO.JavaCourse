package lesson3;

import java.util.Arrays;

public class z1 {


    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(Array));
        System.out.println(sort(Array));
    }
    public static String sort(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {

            if (Array[i] > Array[i + 1]) {
                return "Please, try again!";
            }
        }
        return "OK!";
    }
}
