import java.util.Scanner;
public class lab4_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of list: ");
        n = sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0; i<n; i++)
        {            
            a[i]=sc.nextInt();
        }
        int ele,count=0;
        System.out.println("Enter the element you want to find the occurence of: ");
        ele = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(a[i]==ele)
            count++;
        }
        System.out.println("The element "+ele+" occured "+count+" times!");

    }
}
