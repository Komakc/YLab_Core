package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        arraySort(array);
        try {
            testAssert(array);
            for (int num : array) {
                System.out.print(num + " ");
            }
        } catch (AssertionError e) {
            System.out.println("Method testAssert is failed");
            e.printStackTrace();
        }
    }

    static void arraySort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void testAssert(int[] array) throws AssertionError{
        int[] arrAssert = {1,2,3,4,5,5,6,9};
        boolean isSort = Arrays.equals(array, arrAssert);
        assert isSort;
    }
}