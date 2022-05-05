/* NAME : SURAVI DAS */
import java.util.*;

public class lab3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String s1=sc.next();
        System.out.println("Enter your Second name: ");
        String s2=sc.next();
        String f = s2.concat(" " + s1);
        System.out.println("Name : " +f);
        sc.close();
    }
}
