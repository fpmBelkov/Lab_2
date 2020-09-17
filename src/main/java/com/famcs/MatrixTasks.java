package com.famcs;

import com.sun.media.sound.InvalidFormatException;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixTasks {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter n and m:");
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n * m <= 0) {
                throw new InvalidFormatException("n and m must be positive");
            }

            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    matrix[i][j] = randomNumbersFrom(0, n * m);
                    System.out.print(matrix[i][j] + " ");
                }

                System.out.println();
            }

            Integer[] result = findDiagZeros(n, m, matrix);

            for (int i = 0; i < result.length - 1; i++) {
                System.out.println("For row number " + i + " max element is " + result[i + 1]);
            }

            matrix = swapMaxMinRows(n, m, matrix);
            System.out.println("After swapMinMaxRows()");

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println();

        } catch (Exception ex) {
            System.out.println("Error while reading variables: " + ex);
        }

    }

    public static int randomNumbersFrom(int a, int b) {

        return (int) (Math.random() * (b - a + 1)) + a;

    }

    public static int[][] swapMaxMinRows(int n, int m, int[][] matrix) {

        int max = matrix[0][0], min = matrix[0][0];
        int maxInd = 0, minInd = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    maxInd = i;
                }
                if (matrix[i][j] <= min) {
                    min = matrix[i][j];
                    minInd = i;
                }

            }
        }

        if (maxInd != minInd) {

            int[] temp = new int[m];
            for (int i = 0; i < m; i++) {

                temp[i] = matrix[maxInd][i];
                matrix[maxInd][i] = matrix[minInd][i];
                matrix[minInd][i] = temp[i];

            }

        }

        return matrix;

    }

    public static Integer[] findDiagZeros(int n, int m, int[][] matrix) {

        ArrayList<Integer> maxElemsInd = new ArrayList();

        for (int i = 0, j = 0; i < m && j < m; i++, j++) {
            if (i == j && matrix[i][j] == 0) {
                int maxL = matrix[i][0];

                for (int k = 0; k < m; k++) {
                    if (matrix[i][k] >= maxL) {
                        maxL = matrix[i][k];
                    }
                }

                maxElemsInd.add(i);
                maxElemsInd.add(maxL);

            }
        }

        Integer[] returnArray = maxElemsInd.toArray(new Integer[maxElemsInd.size()]);

        return returnArray;

    }

}


