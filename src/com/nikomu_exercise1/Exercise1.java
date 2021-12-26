package com.nikomu_exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String columnSize;
        String rowSize;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nУкажите кол-во строк матрицы(2-мерного массива): ");
            rowSize = scanner.next();

            if(!isArraySize(rowSize)) {
                System.out.println("Ошибка ввода!!");
            }
        } while(!isArraySize(rowSize));

        do {
            System.out.print("\nУкажите кол-во столбцов матрицы(2-мерного массива): ");
            columnSize = scanner.next();

            if(!isArraySize(columnSize)) {
                System.out.println("\nОшибка ввода!!");
            }
        } while(!isArraySize(columnSize));

        for (int i = 0, count = 0; i < Math.abs(Integer.parseInt(rowSize)); i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < Integer.parseInt(columnSize); j++) {
                    System.out.printf("%5d ", ++count);
                }
            }

            else {
                for (int j = 0; j < Integer.parseInt(columnSize); j++) {
                    System.out.printf("%5d ", ++count + Integer.parseInt(columnSize) - j * 2 - 1);
                }
            }

            System.out.println();
        }
    }

    // Метод для проверки является ли указанное значение размерностью массива
    public static boolean isArraySize(String number) {
        try {
            // Если полученная строка - положительное целочисленное число
            if(Integer.parseInt(number) > 0) {
                return true;
            }

            // Иначе полученная строка - отрицательное целочисленное число
            else {
                return false;
            }
        }
        // При возникновении исключения полученная строка не является числом
        catch (Exception ex) {
            return false;
        }
    }
}
