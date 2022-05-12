import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TwoD
        {
            int l,b;
            double ar , cost;
            public void Data() throws IOException
            {
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(is);
                System.out.println("Enter length of the 2D sheet is : ");
                l = Integer.parseInt(in.readLine());
                System.out.println("Enter breadth of the 2D sheet is : ");
                b = Integer.parseInt(in.readLine());
            }
            public void disp()
            {
                ar = l*b;
                cost = 40*ar;
                System.out.println("The Area : "+ar+" square feet || The Cost of the sheet: Rs "+cost);
            }
        }
class ThreeD extends TwoD
{
    int h;
    public void Data() throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(is);
        System.out.println("* 2D Sheets can be converted into 3D Boxes just by giving a dimension *");
        System.out.println("Enter the height for the making of the 3D box: ");
        h = Integer.parseInt(in.readLine());
    }
    public void disp()
    {
        System.out.println("The volume: "+(l*b*h)+" cube-feet");
        System.out.println("The Cost of the Box: Rs "+(60*l*b*h));
    }
    public void get() throws IOException
    {
        super.Data();
        Data();
    }
    public void display()
    {
        super.disp();
        disp(); 
    }
}
public class lab5_1
{
    public static void main(String[] args) throws IOException 
    {
        ThreeD obj = new ThreeD();
        obj.get();
        obj.display();
    }
}
