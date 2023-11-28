
package methods;

public class RecursivePowerFunction 
{
    public static int recursivePower(int base, int exponent) 
    {
        if (exponent == 0) 
        {
            return 1;
        }
        return base * recursivePower(base, exponent - 1);
    }
}
