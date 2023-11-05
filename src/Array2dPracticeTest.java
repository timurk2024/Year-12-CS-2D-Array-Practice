import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Array2dPracticeTest {

    private int[][] array2d;
    private int[][] array2d2;

    @BeforeEach
    void setUp() {
        array2d = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        array2d2 = new int[][]{
                {11,12,13,14,15},
                {61,71,81,91,101},
                {31,32,33,34,35},
                {160,170,180,190,200}
        };
    }

    @AfterEach
    void tearDown() {
        array2d = null;
    }

    @Test
    void sumAllCells() {
        assertEquals(210, Array2dPractice.sumAllCells(array2d));
        assertEquals(1535, Array2dPractice.sumAllCells(array2d2));
    }

    @Test
    void sumRowN() {
        assertEquals(15, Array2dPractice.sumRowN(array2d,0));
        assertEquals(40, Array2dPractice.sumRowN(array2d,1));
        assertEquals(65, Array2dPractice.sumRowN(array2d,2));
        assertEquals(90, Array2dPractice.sumRowN(array2d,3));

        assertEquals(65, Array2dPractice.sumRowN(array2d2,0));
        assertEquals(405, Array2dPractice.sumRowN(array2d2,1));
        assertEquals(165, Array2dPractice.sumRowN(array2d2,2));
        assertEquals(900, Array2dPractice.sumRowN(array2d2,3));
    }

    @Test
    void sumColN() {
        assertEquals(34, Array2dPractice.sumColN(array2d,0));
        assertEquals(38, Array2dPractice.sumColN(array2d,1));
        assertEquals(42, Array2dPractice.sumColN(array2d,2));
        assertEquals(46, Array2dPractice.sumColN(array2d,3));
        assertEquals(50, Array2dPractice.sumColN(array2d,4));

        assertEquals(263, Array2dPractice.sumColN(array2d2,0));
        assertEquals(285, Array2dPractice.sumColN(array2d2,1));
        assertEquals(307, Array2dPractice.sumColN(array2d2,2));
        assertEquals(329, Array2dPractice.sumColN(array2d2,3));
        assertEquals(351, Array2dPractice.sumColN(array2d2,4));
    }

    @Test
    void sumAllCellsBetween() {
        assertEquals(210, Array2dPractice.sumAllCellsBetween(array2d,0,0,3,4));
        assertEquals(57, Array2dPractice.sumAllCellsBetween(array2d,1,1,2,1));
        assertEquals(65, Array2dPractice.sumAllCellsBetween(array2d,2,0,2,4));
        assertEquals(126, Array2dPractice.sumAllCellsBetween(array2d,0,4,3,0));
        assertEquals(147, Array2dPractice.sumAllCellsBetween(array2d,0,3,3,1));

        assertEquals(1535, Array2dPractice.sumAllCellsBetween(array2d2,0,0,3,4));
        assertEquals(407, Array2dPractice.sumAllCellsBetween(array2d2,1,1,2,1));
        assertEquals(165, Array2dPractice.sumAllCellsBetween(array2d2,2,0,2,4));
        assertEquals(745, Array2dPractice.sumAllCellsBetween(array2d2,0,4,3,0));
        assertEquals(929, Array2dPractice.sumAllCellsBetween(array2d2,0,3,3,1));

    }
}