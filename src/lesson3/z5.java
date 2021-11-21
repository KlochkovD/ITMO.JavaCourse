package lesson3;

public class z5 {
    public static void main(String[] args) {

        int n=5;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        }
    }
