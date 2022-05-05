public class lab4_5
{
	static int c=0;

	public static void main(String[] args)
	{
		lab4_5 ob1=new lab4_5();
		lab4_5 ob2=new lab4_5();
		lab4_5 ob3=new lab4_5();
		lab4_5 ob4=new lab4_5();
		
		ob1.finalize();
		ob2.finalize();
		ob3.finalize();
		ob4.finalize();
        
		System.out.println("No. of objects destroyed is "+c);

    }

    protected void finalize()
    {
		c++;
    }
}
