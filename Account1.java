/*
Name: Kennedy Keyes
Date: September 12, 2021
Program: Account1.class
Description: This is the Account class that contains a name instance
variable and methods to set and get its value.
 */
package accounttest2;

/**
 *
 * @author codingken
 */
public class Account1 
{
    // Declare instance variable
    private String name;
    
    // constructor initializes name with parameter name
    public Account1(String name) { // constructor name is class name
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

