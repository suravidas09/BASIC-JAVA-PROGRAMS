import java.util.*;

class LessBalanceException extends Exception 
{
    public LessBalanceException(String message) 
    {
        super(message);
    }
}

class Account 
{
    int balance = 500;

    public void deposit(int amount) 
    {
        balance += amount;
    }

    public void withdraw(int amount) throws LessBalanceException 
    {
        if (balance - amount < 500) 
        {
            throw new LessBalanceException("Withdraw amount is not valid");
        } 
        else 
        {
            balance -= amount;
        }
    }}

public class lab8_7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("Enter the amount to be deposited");
        int amount = sc.nextInt();
        a.deposit(amount);
        System.out.println("Enter the amount to be withdrawn");
        amount = sc.nextInt();
        try 
        {
            a.withdraw(amount);
        } 
        catch (LessBalanceException e) 
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
