package com.carambula;


public class Main {

    public static void printer(long[][] arr) {
        for (long[] longs : arr) {
            for (long j : longs) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void transposition(long[][] arr, long[][] resultArr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultArr[j][i] = arr[i][j];
            }
        }
    }

    public static long sumOfMaxElems(long[][] arr) {
        long sum = 0;
        int n = arr[0].length;
        for (long[] row : arr) {
            long max = row[0];
            for (int j = 1; j < n; j++) {
                if (row[j] > max) max = row[j];
            }
            sum += max;
        }
        return sum;
    }

    public static void main(String[] args) {
//	    C = Bt
//      a[i][j] - long
//      Sum of max elem rows
        int m = 5;
        int n = 6;
        if (m < 1 || n < 1) {
            System.out.println("m and n must be integer more than 0");
        }
        long[][] matrix = new long[m][n];
        long[][] transMatrix = new long[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) Math.tan((i - 1) * j - m); // random for weak
            }
        }
        System.out.println("Matrix:");
        printer(matrix);
        transposition(matrix, transMatrix);
        System.out.println("Transposed matrix:");
        printer(transMatrix);
        System.out.println("Sum of max elements from each row: " + sumOfMaxElems(transMatrix));
    }
}
