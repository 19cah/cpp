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
package com.abranhe.cop2800;

/**
 * Starting point of the COP2800 assignments
 * For more details go to https://projects.abranhe.com/cop2800;
 *
 * @author Carlos Abraham
 */

import com.abranhe.cop2800.util.Colors;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream p = System.out;

        p.println(Colors.GREEN + "Welcome to @abranhe\'s COP2800 Projects.\n" + Colors.RESET);

        p.println("I am creating this whole project long time after");
        p.println("the original projects were created, each project");
        p.println("were created in different times, and I didn\'t ");
        p.println("want it to complicate myself creating the the ");
        p.println("possibility to run all the projects from here");
        p.print("so you will have to run each project separately. ");
        p.println(Colors.RED + ":(\n" + Colors.RESET);

        p.print("For more information visit ");
        p.println(Colors.CYAN + "https://projects.abranhe.com/cop2800\n" + Colors.RESET);

        p.println("1 - Calorie Tracker");
        p.println("2 - Bank Account");
        p.println("3 - Advanced Bank Account");
    }
}
