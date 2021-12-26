package com.nikomu;

import com.nikomu_exercise1.Exercise1;
import com.nikomu_exercise2.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol;

        do {
            // Блок текста, представляющий информацию о возможных действиях
            String menu = """
                    [1] - Задание №1;
                    [2] - Задание №2;        
                    [q] - Выход из приложения.""";

            System.out.println("\n\n\tДомашнее задание №1\n\tМулина Николая");
            System.out.println("\t\tГлавное меню");
            System.out.println(menu);
            System.out.print("Ваш выбор: ");
            symbol = input.nextLine();

            switch (symbol) {
                case "1":
                    Exercise1.main(null);
                    break;
                case "2":
                    Exercise2.main(null);
                    break;
                case "q":
                case "Q":
                case "й":
                case "Й":
                    System.out.println("Выходим из приложения...");
                    break;
                default:
                    System.out.println("Нет такого пункта меню");
            }
            // Работаем в цикле пока пользователь не нажмет клавишу "q"
        } while (!symbol.equals("q") && !symbol.equals("Q") && !symbol.equals("й") && !symbol.equals("Й"));
    }
}
