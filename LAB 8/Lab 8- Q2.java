class superclass 
{
    public void method() throws ArithmeticException 
    {
        System.out.println("Inside superclass method");
    }
}

class subclass extends superclass 
{
    public void method() throws Error 
    {
        System.out.println("Inside subclass method");
    }
}

public class lab8_2
{
    public static void main(String[] args) {
        subclass obj = new subclass();
        try {
            obj.method();
        } 
        catch (Error e) {
            System.out.println("Error");
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
