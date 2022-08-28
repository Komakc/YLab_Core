package task1;

public class Main {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 5;
        int[][] arrayNumber = new int[SIZE_ARRAY][SIZE_ARRAY];
        getArrayRandomNumber(arrayNumber);
        printArray(arrayNumber);
        int maxNumber = getMaxNumber(arrayNumber);
        int minNumber = getMinNumber(arrayNumber);
        int averageNumber = (maxNumber - minNumber) / 2;
        System.out.printf("Max number: %d\nMin number: %d\nAverage number: %d", maxNumber, minNumber, averageNumber);
    }

    static void getArrayRandomNumber(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
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