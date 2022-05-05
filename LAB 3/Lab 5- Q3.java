class a
{
    void callme()
    {
        System.out.println("Inside a ");
    }
}
class b extends a
{
    void callme()
    {
        System.out.println("Inside b ");
    }
}
class c extends b
{
    void callme()
    {
        System.out.println("Inside c ");
    }
}
public class lab5_3
{
    public static void main(String[] args) 
    {
        a A= new a();
        b B= new b();
        c C= new c();
        a r;
        r=A;
        r.callme();
        r=B;
        r.callme();
        r=C;
        r.callme();
    } 
}
