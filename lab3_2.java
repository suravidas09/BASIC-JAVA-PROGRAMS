import java.util.*;

public class lab3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks scored- ");
        int m = sc.nextInt();
        sc.close();
        if (m < 40) {
            System.out.println("Fail");
        } else if (m >= 40 && m < 50) {
            System.out.println("D grade");
        } else if (m >= 50 && m < 60) {
            System.out.println("C grade");
        } else if (m >= 60 && m < 70) {
            System.out.println("B grade");
        } else if (m >= 70 && m < 80) {
            System.out.println("A grade");
        } else if (m >= 80 && m < 90) {
            System.out.println("E grade");
        } else if (m >= 90 && m < 100) {
            System.out.println("O grade");
        } else {
            System.out.println("Invalid!");
        }
    }
}
