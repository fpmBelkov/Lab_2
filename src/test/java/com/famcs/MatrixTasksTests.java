package com.famcs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTasksTests {

    @Test
    public static void matrixTests() {

        // int[][] actualResult = MatrixTasks.swapMaxMinRows(5,1,new int[][] {{6},{2},{3},{4},{9}});
        //int [][] expectedResult = new int [][] {{6},{2},{3},{4},{9}};

        int[][] actualResult = MatrixTasks.swapMaxMinRows(2, 2, new int[][]{{-10, 10}, {100, 200}});
        int[][] expectedResult = new int[][]{{100, 200}, {-10, 10}};

        assertArrayEquals(actualResult, expectedResult);

        Integer[] actualResult1 = MatrixTasks.findDiagZeros(2, 2, new int[][]{{0, 0}, {0, 0}});
        Integer[] expectedResult1 = new Integer[]{0, 0, 1, 0};

        assertArrayEquals(actualResult1, expectedResult1);

    }
}
