interface Motor
{
    int capacity = 500;
    void run();
    void consume();
}

class WashingMachine implements Motor
{
    public void run()
    {
        System.out.println("it is Running");
    }
    public void consume()
    {
        System.out.println("it is Consuming");
    }
}

class lab6_2
{
    public static void main(String args[])
    {
        WashingMachine w = new WashingMachine();
        w.run();
        w.consume();
        System.out.println(Motor.capacity);
    }
}
