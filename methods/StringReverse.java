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
package methods;

/**
 *
 * @author huong
 */
public class StringReverse 
{

    /**
     *
     * @param inputStr
     */
    public static void reverseString(String inputStr) 
    {
        reverseStringHelper(inputStr, inputStr.length() - 1);
    }

    private static void reverseStringHelper(String inputStr, int index) 
    {
        if (index >= 0) 
        {
            System.out.print(inputStr.charAt(index));
            reverseStringHelper(inputStr, index - 1);
        }
    }
}
