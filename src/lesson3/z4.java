package lesson3;

public class z4 {

    public static void main(String[] args) {

        int[] array = {1,2,3,1,2,4};
        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length-1; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count;
    }
}