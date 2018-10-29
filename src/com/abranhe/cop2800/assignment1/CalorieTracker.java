/**
 * This is free and unencumbered software released into the public domain.
 * <p>
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * <p>
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * For more information, please refer to <http://unlicense.org>
 */
package com.abranhe.cop2800.assignment1;

import java.util.*;
import java.io.PrintStream;

/**
 * Assignment No. 1: CalorieTracker
 *
 * @author Carlos Abraham
 */
public class CalorieTracker {

    static final int DAYS_OF_THE_WEEK = 7;
    static final int NUMBER_OF_MEALS = 4;

    /**
     * Ask user to enter the calories eaten
     *
     * @param days  days
     * @param meals meals
     * @return an array containing the values entered by the user
     */
    public static double[][] getUserInput(String[] days, String[] meals) {

        Scanner scan = new Scanner(System.in);
        PrintStream p = System.out;

        double[][] numbers;
        numbers = new double[DAYS_OF_THE_WEEK][NUMBER_OF_MEALS];
        boolean valid = false;
        double input;

        for (int i = 0; i < DAYS_OF_THE_WEEK; i++) {
            for (int j = 0; j < NUMBER_OF_MEALS; j++) {
                valid = false;
                // Do not accept any NON-POSITIVE or NON-NUMERIC value

                valid = false; //Restart "valid" variable for each new user input
                do {
                    p.print("Enter the calories eaten on " + days[i] + " at " + meals[j] + ": ");
                    input = scan.nextDouble();
                    if (input >= 0) {
                        valid = true;
                    } else {
                        p.println("The value entered is not a positive number.");
                    }
                } while (!valid);
                // Store the variable "input" in the array
                numbers[i][j] = input;
            }
        }
        scan.close();
        return numbers;
    }

    /**
     * Print values in tabular mode
     *
     * @param numbers calories
     * @param days    days
     * @param meals   meals day
     */
    public static void printTable(double[][] numbers, String[] days, String[] meals) {

        PrintStream p = System.out;

        for (int row = 0; row < DAYS_OF_THE_WEEK; row++) {

            p.println(days[row].toUpperCase());
            for (int col = 0; col < NUMBER_OF_MEALS; col++) {

                p.print(meals[col].substring(0, 1).toUpperCase() + meals[col].substring(1).toLowerCase() + ": " + numbers[row][col] + "\t");
            }
            p.println("\n");
        }

    }

    /**
     * Calculate the amount of calories consumed each day
     *
     * @param numbers the amount of calories
     * @return the total amount of calores each day
     */
    public static double[] total(double[][] numbers) {
        double totalPerDay = 0;
        double[] total = new double[DAYS_OF_THE_WEEK];

        for (int row = 0; row < DAYS_OF_THE_WEEK; row++) {
            for (int col = 0; col < NUMBER_OF_MEALS; col++) {
                totalPerDay += numbers[row][col];
            }
            total[row] = totalPerDay;
            totalPerDay = 0;
        }
        return total;
    }

    /**
     * Calculate the average daily calorie consumption for the whole week.
     *
     * @param total the total amount of calories eaten daily
     * @return the average daily calorie consumption
     */
    public static double getAverage(double[] total) {

        double weekTotal = 0;
        for (int i = 0; i < DAYS_OF_THE_WEEK; i++) {
            weekTotal += total[i];
        }
        return weekTotal / DAYS_OF_THE_WEEK;
    }

    /**
     * Get the biggest amount of calories eaten during the week
     *
     * @param numbers calories taken
     * @param days    days
     * @param meals   meals
     */
    public static void getMaxValue(double[][] numbers, String[] days, String[] meals) {

        PrintStream p = System.out;

        double maxValue = numbers[0][0];
        String maxCalorieDay = days[0];
        String maxCalorieMeal = meals[0];


        for (int i = 0; i < DAYS_OF_THE_WEEK; i++) {
            for (int j = 0; j < NUMBER_OF_MEALS; j++) {
                if (numbers[i][j] > maxValue) {
                    maxValue = numbers[i][j];
                    maxCalorieDay = days[i];
                    maxCalorieMeal = meals[j];
                }
            }
        }
        p.println("The biggest amount of calories eaten was " + maxValue + " on " + maxCalorieDay + " at " + maxCalorieMeal);

    }

    /**
     * Get the smallest amount of calories eaten during the week
     *
     * @param numbers calores taken
     * @param days    days
     * @param meals   meals
     */
    public static void getMinValue(double[][] numbers, String[] days, String[] meals) {
        PrintStream p = System.out;

        double minValue = numbers[0][0];
        String minCalorieDay = days[0];
        String minCalorieMeal = meals[0];


        for (int i = 0; i < DAYS_OF_THE_WEEK; i++) {
            for (int j = 0; j < NUMBER_OF_MEALS; j++) {
                if (numbers[i][j] < minValue) {
                    minValue = numbers[i][j];
                    minCalorieDay = days[i];
                    minCalorieMeal = meals[j];
                }
            }
        }
        p.println("The smallest amount of calories eaten was " + minValue + " on " + minCalorieDay + " at " + minCalorieMeal);

    }
}

