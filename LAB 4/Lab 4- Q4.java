class A
{
    static int count;
    A()
    {
        count++;
    }
    void number()
    {
        System.out.println("The number of objects created is: "+count);

    }
}
public class lab4_4 
{
    public static void main(String arg[])
    {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        A obj4 = new A();
        obj1.number();
    }
}
