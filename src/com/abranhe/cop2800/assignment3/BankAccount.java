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
package com.abranhe.cop2800.assignment3;

/**
 * Assignment No. 3: Advanced Bank Account
 *
 * @author Carlos Abraham
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class BankAccount {

    private String accountId;
    private double accountBalance;
    private static double annualInterestRate;
    private final Date dateCreated;
    private static SimpleDateFormat simpleDateFormat;
    private String name;
    private String password;


    /**
     * Default Constructor
     * Set Account Balance to $0
     */
    public BankAccount() {
        accountId = Integer.toString(generateRandomAccountID());
        dateCreated = new Date();
        simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        annualInterestRate = 0;
        password = passwordGenerator();
    }

    /**
     * BankAccount Constructor.
     *
     * @param accountBalance account balance in the account.
     * @param name           name of the costumer
     */
    public BankAccount(double accountBalance, String name) {
        this();
        this.accountBalance = accountBalance;
        this.name = name;
    }

    /**
     * Return a four digits random integer
     *
     * @return four random integers
     */
    private int generateRandomAccountID() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return simpleDateFormat.format(dateCreated);
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        BankAccount.annualInterestRate = annualInterestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the Monthly Interest Rate, dividing the annual interest rate
     * by the number of month in a year
     * <p>
     * 12: Months of the year
     *
     * @return monthly interest rate.
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * Method to withdraw money from the bank account
     *
     * @param moneyOut money that will be extracted from the account.
     * @return difference of the account balance and the money deposited.
     */
    public double withdraw(double moneyOut) {

        //Don't let the user withdraw money if there are
        //not enough money on his balance

        if (accountBalance > moneyOut)
            return accountBalance -= moneyOut;
        return accountBalance;
    }

    /**
     * Method to deposit money from the bank account
     *
     * @param moneyIn money that will be deposited in the account.
     * @return sum of the account balance and the money deposited.
     */
    public double deposit(double moneyIn) {
        return accountBalance += moneyIn;
    }

    /**
     * Generate a four digits String Password
     *
     * @return password
     */
    private String passwordGenerator() {
        String password = "";
        Random r = new Random();

        for (int i = 0; i < 4; i++) {

            //Generate a random letter
            char c = (char) (r.nextInt(26) + 'a');
            //add letters to create an string
            password += c;
        }
        return password;
    }
}