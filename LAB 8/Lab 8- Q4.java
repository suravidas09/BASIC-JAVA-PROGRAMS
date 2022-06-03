import java.util.*;
class NegativeNumberException extends Exception 
{
    public NegativeNumberException(String s) 
    {
        super(s);
    }
}
public class lab8_4 
{
    public static void processInput(int n) throws NegativeNumberException 
    {
        if (n < 0) 
        {
            throw new NegativeNumberException("Negative number");
        } 
        else 
        {
            System.out.println(2 * n);
         }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        try 
        {
            processInput(n);
        } 
        catch (NegativeNumberException e) 
        {
            System.out.println(e);
        }
        sc.close();
    }
}
