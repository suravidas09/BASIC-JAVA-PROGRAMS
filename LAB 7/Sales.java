package marketing;
import java.util.*;
import general.*;
class Sales{
public static double tallowance(double e)
    {
        return e * 0.05;
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the Name:");
    String name = sc.nextLine();
    System.out.println("Please enter the Employee ID:");
    int id = sc.nextInt();
    System.out.println("Please enter the Basic Salary:");
    double sal = sc.nextDouble();
    Employee obj1 = new Employee(name, id, sal);
    obj1.printName();
    double e = obj1.earnings();
    System.out.println("Earnings : " + e);
    System.out.println("Travel allowance : " + tallowance(e));
    sc.close();
    }
}
