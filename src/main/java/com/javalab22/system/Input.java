package com.javalab22.system;

import java.util.Scanner;

/**
 * Created by erad on 12.06.2017.
 */
public class Input {
    public int inputNumber(String s) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(s);
            try {
                return input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введено неверное число");
                input.nextLine();
            }
        }
    }
}
