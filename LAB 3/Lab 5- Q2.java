import java.util.Scanner;
class plate
{
    int l, w;
    plate()
    {
        System.out.println("Plate constructor called");
    }
    void get_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width: (inside plate class)");
        l = sc.nextInt();
        w = sc.nextInt();
        sc.close();
    }
    void show_data()
    {
        System.out.println("The length is(inside plate class): "+l+" and the width is: "+w);
    }
}

class box extends plate
{
    int h;
    box()
    {
        System.out.println("box constructor called");
    }
    void get_data()
    {
        super.get_data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: (inside box class)");
        h = sc.nextInt();
        sc.close();
    }
    void show_data()
    {
        super.show_data();
        System.out.println("The height is(inside box class): "+h);
    }
}

class woodBox extends box{
    int thick;
    woodBox()
    {
        System.out.println("woodBox constructor called");
    }
    void getdata()
    {
        super.get_data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the thickness: (inside woodBox class)");
        thick = sc.nextInt();
        sc.close();
    }
    void showdata()
    {
        super.show_data();
        System.out.println("The thickness is(inside woodBox class): "+thick);
    }
}


public class lab5_2 {
    public static void main(String arg[])
    {
        woodBox wb = new woodBox();
        wb.getdata();
        wb.showdata();
    }
}
