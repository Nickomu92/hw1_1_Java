package com.nikomu_exercise2;

import com.nikomu_exercise1.Exercise1;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String columnSize;
        String rowSize;
        String count;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nУкажите кол-во рядов: ");
            rowSize = scanner.next();

            if(!Exercise1.isArraySize(rowSize)) {
                System.out.println("\nОшибка ввода!!");
            }
        } while(!Exercise1.isArraySize(rowSize));

        do {
            System.out.print("\nУкажите кол-во мест в ряду: ");
            columnSize = scanner.next();

            if(!Exercise1.isArraySize(columnSize)) {
                System.out.println("\nОшибка ввода!!");

            }
        } while(!Exercise1.isArraySize(columnSize));

        int row = Math.abs(Integer.parseInt(rowSize));
        int column = Math.abs(Integer.parseInt(columnSize));

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (int)(Math.random() * 2);
                System.out.printf("%s ", array[i][j]);
            }
            System.out.println();
        }

        do {
            System.out.print("\nУкажите кол-во необходимых рядом мест: ");
            count = scanner.next();

            if(!Exercise1.isArraySize(count)) {
                System.out.println("\nОшибка ввода!!");
            }
        } while(!Exercise1.isArraySize(count));

        boolean isTrue = false;

        for (int i = 0; i < row; i++) {
            String tempStr = "";
            String resultStr = "";
            int placeCount = 0;

            for (int j = 0; j < column; j++) {
                if(array[i][j] == 0) {
                    placeCount++;
                    tempStr += placeCount == 1 ? String.format("%s", j + 1) : String.format(", %s", j + 1);
                    continue;
                }

                else if(array[i][j] == 1) {
                    if (placeCount >= Integer.parseInt(count)) {
                        resultStr += resultStr == "" ? tempStr : ", " + tempStr;
                        isTrue = true;
                    }
                    tempStr = "";
                    placeCount = 0;
                }
            }

            if(placeCount >= Integer.parseInt(count)) {
                resultStr += resultStr == "" ? tempStr : ", " + tempStr;
                isTrue = true;
            }

            if(resultStr != "") {
                System.out.printf("\n%d ряд : %s", i + 1, resultStr);
            }
        }

        if(!isTrue) {
            System.out.println("\nУказанного количества мест, расположенных рядом нет!");
        }
    }
}
