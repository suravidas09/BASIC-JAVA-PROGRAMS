import java.util.*;

public class lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number- ");
        int n = sc.nextInt();
        int rem, s = 0, temp;
        temp = n;
        while (n > 0) {
            rem = n % 10;
            s = (s * 10) + rem;
            n = n / 10;
        }
        if (temp == s)
            System.out.println("It is a palindrome number ");
        else
            System.out.println("It is not a palindrome");
    }
}
