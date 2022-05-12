class a
{
    a(int i)
    {
        System.out.println(i);
    }
}
class b extends a
{
    b()
    {
        super(20);
    }
}
public class lab5_6 
{
    public static void main(String[] args) 
    {
        b obj=new b();
    }
}
