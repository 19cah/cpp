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
package com.abranhe.cop2800.assignment2;

/**
 * Assignment No. 2: Bank Account
 *
 * @author Carlos Abraham
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.PrintStream;

public class BankAccount {

    private int accountId;
    private double accountBalance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");


    public BankAccount() {
        accountId = generateRandomAccountID();
    }

    public BankAccount(double accountBalance) {
        accountId = generateRandomAccountID();
        this.accountBalance = accountBalance;
    }

    /**
     * Generator for account ID
     * @return random ID
     */
    public int generateRandomAccountID() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12; // 12 => Months of the year
    }

    /**
     * Withdraw Method
     * @param moneyOut money extracted
     * @return account balance
     */
    public double withdraw(double moneyOut) {
        return accountBalance -= moneyOut;
    }

    /**
     * Deposit Method
     * @param moneyIn money entered
     * @return account balance
     */
    public double deposit(double moneyIn) {
        return accountBalance += moneyIn;
    }

    //Display Data to the costumer
    public static void displayData(BankAccount bankAccount) {

        PrintStream p = System.out;

        p.println("Account ID: " + bankAccount.getAccountId());
        p.println("Balance: $" + bankAccount.getAccountBalance());
        p.println("Monthly Interest:  " + bankAccount.getMonthlyInterestRate() + "%");
        p.println("Created on: " + simpleDateFormat.format(bankAccount.getDateCreated()));
    }
}
