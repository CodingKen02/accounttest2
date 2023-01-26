/*
Name: Kennedy Keyes
Date: September 12, 2021
Program: AcountTest2
Description: This program uses the Account2 constructor to initalize the 
name instance variable at the time each Account2 object is created.
 */
package accounttest2;

/**
 *
 * @author codingken
 */
public class AccountTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create two Account objects
        Account2 account1 = new Account2("Jane Green");
        Account2 account2 = new Account2("John Blue");
        
        // display initial value of name for each Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
    
}
