public class lab4_1 
{
    public static void main(String[] args) 
    {
        int x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = scan.nextInt();
        System.out.print("Enter the second number:");
        y = scan.nextInt();
        System.out.print("Enter the third number:");
        z = scan.nextInt();
        scan.close();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}
