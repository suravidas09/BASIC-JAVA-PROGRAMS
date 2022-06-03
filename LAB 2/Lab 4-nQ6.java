import java.util.Scanner;
public class lab4_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the order of the matrix: ");
        n = sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter "+n*n+" elements: ");
        int i,j,left,right;
        left=right=0;
        for(i=0; i<n; i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }   
        }
        
        for(i=0; i<n; i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                left+=a[i][j];
                if((i+j)==n-1)
                right+=a[i][j];
            }   
        }

        System.out.println("The entered matrix is: ");
        for(i=0; i<n; i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }  
            System.out.println("\n"); 
        }

        System.out.println("The sum of elements of the left diagonal is: "+left); 
        System.out.println("The sum of elements of the right diagonal is: "+right);
    }
}
