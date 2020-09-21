package com.famcs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSwapRows {

    @Test
    public static void testSwapRows() {

        int[][] actualResult = MatrixTasks.swapMaxMinRows(2, 2, new int[][]{{-10, 10}, {100, 200}});
        int[][] expectedResult = new int[][]{{100, 200}, {-10, 10}};

        assertArrayEquals(actualResult, expectedResult);

    }
}
