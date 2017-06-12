package com.javalab22.main;

import com.javalab22.operations.MatrixOperations;
import com.javalab22.system.Input;

/**
 * Created by erad on 12.06.2017.
 */
public class MatrixMultiplication {
    public static void main(String[] args){

        int[][] matrix1;
        int[][] matrix2;

        ///ввод размеров матриц
        Input in = new Input();

        String message = "Введите количество строк матрицы 1:";
        int l1 = in.inputNumber(message);
        message = "Введите количество столбцов матрицы 1:";
        int c1 = in.inputNumber(message);
        message = "Введите количество строк матрицы 2:";
        int l2 = in.inputNumber(message);
        message = "Введите количество столбцов матрицы 2:";
        int c2 = in.inputNumber(message);

        //заполнение матриц
        MatrixOperations m = new MatrixOperations();

        System.out.println("Матрица 1, размер " + l1 + "x" + c1);
        matrix1 = m.fillMatrix(l1,c1);
        m.printMatrix(matrix1);

        matrix2 = m.fillMatrix(l2,c2);
        System.out.println("Матрица 2, размер " + l2 + "x" + c2);
        m.printMatrix(matrix2);

        //умножение матриц
        MatrixOperations resultMatrix1 = new MatrixOperations();
        if (resultMatrix1.isPossibleToMultiply(matrix1,matrix2)) {
            System.out.println("Результат умножения - матрица, размер " + matrix1.length + "x" + matrix2[0].length);
            m.printMatrix(resultMatrix1.multiplyMatrix(matrix1,matrix2));
        }
    }
}
