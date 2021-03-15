package ru.geekbrains.java.level1.lesson_2;

public class Lesson2 {

    private static int i;

    public static void invertArray() {
        int[] arr = {1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (i == 1) {
                i = 0;
            } else {
                i = 1;
            }
        }
    }

    public static void myArray() {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i += 3) ;
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (i < 6) {
                i = i * 2;
            }
        }
    }

    public static void diagonalArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr[i][i] = 1;
        }
    }

    public static void taskFive() {
        int[] myBestArray = {-3, 345, 0, -312, 7999, -5111};
        int min = myBestArray[0];
        int max = myBestArray[0];
        for (int i = 0; i < myBestArray.length; i++) {
            if (min >= myBestArray[i]) {
                min = myBestArray[i];
            } else if (max <= myBestArray[i]) {
                max = myBestArray[i];
            }
        }
    }

    public static boolean taskSix(int[] myTopArray) {
        int sumMyTopArray = 0;
        int leftPartOfArray = 0;
        for (int i = 0; i < myTopArray.length; i++) {
            sumMyTopArray += myTopArray[i];
        }
        for (int i = 0; i < myTopArray.length; i++) {
            leftPartOfArray += myTopArray[i];
            if (leftPartOfArray == sumMyTopArray - leftPartOfArray) {
                return true;
            }
        }
        return false;
    }

    public static void taskSeven(int[] myTopArraySeven, int n) {
        int temp;
        int len = myTopArraySeven.length - 1;
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = myTopArraySeven[0];
                System.arraycopy(myTopArraySeven, 1, myTopArraySeven, 0, len);
                myTopArraySeven[len] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                temp = myTopArraySeven[len];
                System.arraycopy(myTopArraySeven, 0, myTopArraySeven, 1, len);
                myTopArraySeven[0] = temp;
            }
        }
    }
}