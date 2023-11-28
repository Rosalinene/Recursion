
package recursion;

import static methods.RecursiveMultiplication.recursiveMultiplication;
import static methods.RecursivePowerFunction.recursivePower;
import static methods.StringReverse.reverseString;

public class Recursion 
{
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
