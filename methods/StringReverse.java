
package methods;

public class StringReverse 
{
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
