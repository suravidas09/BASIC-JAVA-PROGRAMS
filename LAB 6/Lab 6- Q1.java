package com.company;
import java.util.*;

interface Accounts {
    void earnings(int basic);
    void deduction(int basic);
    void bonus(int basic);
}

abstract class Manager implements Accounts{
    @Override
    public void earnings(int basic) {
        int da=basic*80/100;
        int hra=basic*15/100;
        int ans=basic+hra+da;
        System.out.println(ans);
    }
    @Override
    public void deduction(int basic) {
        int pf=basic*12/100;
        System.out.println(pf);
    }
}

class Substaff extends Manager{
    @Override
    public void bonus(int basic) {
        int b=basic*50/100;
        System.out.println(b);
    }
}

public class lab6_3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Basic Salary: ");
            int basic=sc.nextInt();
            Substaff obj =new Substaff();
            System.out.print("Earning: ");
            obj.earnings(basic);
            System.out.print("Bonus: ");
            obj.bonus(basic);
            System.out.print("Deduction: ");
            obj.deduction(basic);
    }
}
