package task1;

import java.util.Arrays;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 5;
        int[][] arrayNumber = new int[SIZE_ARRAY][SIZE_ARRAY];
        getArrayWithRandomNumber(arrayNumber);
        printArray(arrayNumber);
        int maxNumber = getMaxNumber(arrayNumber);
        int minNumber = getMinNumber(arrayNumber);
        int averageNumber = (maxNumber - minNumber) / 2;
        System.out.printf("Max number: %d\nMin number: %d\nAverage number: %d", maxNumber, minNumber, averageNumber);
    }

    static void getArrayWithRandomNumber(int[][] array) {
        int randomNumber = 1;
        int time = (int) System.currentTimeMillis();
        int a = 44;
        int m = 12345;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                randomNumber = (a * randomNumber - time) % m;
                array[i][j] = randomNumber;
            }
        }
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int getMaxNumber(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    static int getMinNumber(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}