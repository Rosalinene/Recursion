
package methods;

public class RecursiveMultiplication 
{
    public static int recursiveMultiplication(int x, int y) 
    {
        if (y == 0) 
        {
            return 0;
        }
        return x + recursiveMultiplication(x, y - 1);
    }
}
