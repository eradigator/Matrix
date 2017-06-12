package com.javalab22.operations;

/**
 * Created by erad on 12.06.2017.
 */
public class MatrixOperations {
    ///проверка на возможность умножения матриц
    public boolean isPossibleToMultiply (int[][]matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length ||
                matrix1.length < 1 ||
                matrix1[0].length < 1 ||
                matrix2.length < 1 ||
                matrix2[0].length < 1) {
            System.out.println("Умножение матриц невозможно");
            return false;
        } else
            return true;
    }

    //заполнение матрицы
    public int[][] fillMatrix(int l, int c) {
        int[][] matrix = new int[l][c];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = (int)(Math.random()*11-10);
            }
        }
        return matrix;
    }

    //умножениие матриц
    public int[][] multiplyMatrix (int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i=0; i<matrix1.length; i++) {
            for (int j=0; j<matrix2[0].length; j++) {
                for (int k=0; k<matrix2.length; k++ ) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }

    //вывод матрицы на экран
    public void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.format("%4d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
