package com.famcs;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
public class TestFindDiagZeros {

    @Test

    public static void testFindDiagZeros() {

        Integer[] actualResult = MatrixTasks.findDiagZeros(2, 2, new int[][]{{0, 0}, {0, 0}});
        Integer[] expectedResult = new Integer[]{0, 0, 1, 0};
        assertArrayEquals(actualResult, expectedResult);

    }


}
