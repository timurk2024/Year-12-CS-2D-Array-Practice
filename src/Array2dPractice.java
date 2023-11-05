public class Array2dPractice {

    // Sum of all cells in a 2D array
    public static int sumAllCells(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int cell : row) {
                sum += cell;
            }
        }
        return sum;
    }

    // Sum of all cells in a specific row
    public static int sumRowN(int[][] array, int row) {
        int sum = 0;
        for (int cell : array[row]) {
            sum += cell;
        }
        return sum;
    }

    // Sum of all cells in a specific column
    public static int sumColN(int[][] array, int col) {
        int sum = 0;
        for (int[] row : array) {
            sum += row[col];
        }
        return sum;
    }

    // Sum of all cells between (and including) two cells
    public static int sumAllCellsBetween(int[][] array, int row1, int col1, int row2, int col2) {
        int sum = 0;
        int startRow = Math.min(row1, row2);
        int endRow = Math.max(row1, row2);
        int startCol = Math.min(col1, col2);
        int endCol = Math.max(col1, col2);

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}