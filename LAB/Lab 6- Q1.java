abstract class Student
{
    long roll_no, reg_no;
    abstract void Course();
}

class Kiitian extends Student
{
    Kiitian(long roll, long reg)
    {
        roll_no=roll;
        reg_no=reg;
    }

    @Override
    void Course()
    {
        System.out.println("Course was taught to Roll No : "+roll_no+ "& Reg_No :" +reg_no);
    }
}

class lab6_1
{
    public static void main(String[] args) {
        Kiitian ks = new Kiitian(20051388, 1388);
        ks.Course();
    }
}

