/**
 * @author Huong Pham
 * Course: CSC 112-301 Fund of computing II
 * Assignment: Recursion
 * Description: In this assignment you will create 3 recursive functions. Have main call the 3
functions showing that they work. Call each function at least two different time
with different values each time.
Recursive Multiplication – This recursive function will accept two arguments into
the parameters x and y. The function should return the value of x times y.
Remember, multiplication can be performed as repeated addition.
7 * 4 = 4 + 4 + 4 + 4 + 4 + 4 + 4
Recursive Power Function – This recursive function will raise a number to a
power. The function should accept two arguments, the number to be raised and
the exponent. Assume that the exponent is a nonnegative integer.
String Reverser – Write a recursive function that accepts a string object as its
argument and prints the string in reverse order.
 */
package recursion;

import static methods.RecursiveMultiplication.recursiveMultiplication;
import static methods.RecursivePowerFunction.recursivePower;
import static methods.StringReverse.reverseString;

public class Recursion 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        // Test recursive multiplication
        int resultMul1 = recursiveMultiplication(7, 4);
        int resultMul2 = recursiveMultiplication(5, 3);
        System.out.println("Recursive Multiplication Results: " + resultMul1 + ", " + resultMul2);

        // Test recursive power
        int resultPow1 = recursivePower(2, 3);
        int resultPow2 = recursivePower(4, 2);
        System.out.println("Recursive Power Results: " + resultPow1 + ", " + resultPow2);

        // Test string reverser
        System.out.print("String Reverser Results: ");
        reverseString("hello");
        System.out.print(", ");
        reverseString("java");
    } 
}
