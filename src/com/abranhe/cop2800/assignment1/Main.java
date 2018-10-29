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

import java.io.PrintStream;

/**
 * Testing for assignment No. 1: CalorieTracker
 *
 * @author Carlos Abraham
 */
public class Main {
    public static void main(String[] args) {

        PrintStream p = System.out;
        CalorieTracker c = new CalorieTracker();

        String[] weekDays = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
        };

        String[] meals = {
                "breakfast",
                "lunch",
                "dinner",
                "snack",
        };

        // Get User Input and Store the value in the array "table"
        double[][] table = c.getUserInput(weekDays, meals);
        p.println();

        // Print the values entered by the user as a table, to make it easier to read
        c.printTable(table, weekDays, meals);
        p.println();

        // Print the biggest amount of calories eaten during the week
        c.getMaxValue(table, weekDays, meals);

        // Print the smallest amount of calories eaten during the week
        c.getMinValue(table, weekDays, meals);
        p.println();

        // Print total of calories per day
        for (int i = 0; i < c.DAYS_OF_THE_WEEK; i++) {
            p.println("Total of calories on " + weekDays[i] + ": " + c.total(table)[i] + " ");
        }

        //Print the average daily calorie consumption for the whole week.
        p.printf("\nThe average daily caloric consumption for the whole week: %.2f", c.getAverage(c.total(table)));
    }
}
