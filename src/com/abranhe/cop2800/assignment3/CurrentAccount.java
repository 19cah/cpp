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

public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public void setOverdraftLimit(double overdrafLimit) {
        this.overdraftLimit = overdrafLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Extract money from the account balance
     *
     * @param moneyOut money that will be extracted from the account.
     * @return difference of the account balance and the money
     * the costumer want to extract.
     */
    @Override
    public double withdraw(double moneyOut) {

        //Allow transaction if the user have enough money
        if (getAccountBalance() < moneyOut) {

        }

        else
            setAccountBalance(getAccountBalance() - moneyOut);

        // Remind the user, they are using overdraft service
        if (getAccountBalance() + getOverdraftLimit() > moneyOut) {
            System.out.println("You are using our overdraft service");
            setAccountBalance(getAccountBalance() - moneyOut);
        } else

            // Don't let the user complete transaction if they are
            // requesting more money than the overdraft limit

            System.out.println("Due you are requesting more money than our overdraft limit"
                    + " is providing, you cannot compleate the transaction.");

        return 0;
    }
}