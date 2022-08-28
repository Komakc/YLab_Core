package task1;

public class Main {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 5;
        int[][] arrayNumber = new int[SIZE_ARRAY][SIZE_ARRAY];
        getArrayWithRandomNumber(arrayNumber);
        printArray(arrayNumber);
        int maxNumber = getMaxNumber(arrayNumber);
        int minNumber = getMinNumber(arrayNumber);
        double averageNumber = getAvgNumber(arrayNumber);
        System.out.printf("Max number: %d\nMin number: %d\nAverage number: %.2f", maxNumber, minNumber, averageNumber);
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

    static double getAvgNumber(int[][] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }
}
