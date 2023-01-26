/*
Name: Kennedy Keyes
Date: September 12, 2021
Program: Account2.class
Description: This Account class uses a constructor that initializes the name.
 */
package accounttest2;

/**
 *
 * @author codingken
 */
public class Account2 {
    private String name; // instance variable
    
    // constructor initializes name with parameter name
    public Account2(String name) { // constructor name is class name
        this.name = name;
    }
    
    // method to set the name
    public void setName(String name) {
        this.name = name;
    }
    
    // method to retrieve the name
    public String getName() {
        return name;
    }
    
}
