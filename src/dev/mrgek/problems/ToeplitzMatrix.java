package dev.mrgek.problems;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {

        int i = 0;
        int j = 0;

        final int width = matrix.length;
        final int height = matrix[0].length;

        int element = matrix[i][j];

        while (i < width && j < height) {

            if (element != matrix[i][j])
                return false;

            element = matrix[i][j];

            i++;
            j++;
        }

        if (width == height)
            return true;

        i = 1;
        j = 0;
        element = matrix[i][j];

        while (i < width && j < height) {

            if (element != matrix[i][j])
                return false;

            element = matrix[i][j];

            i++;
            j++;
        }

        return true;
    }
}
