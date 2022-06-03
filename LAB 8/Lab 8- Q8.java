import java.util.*;

class Stack 
{
    int[] stack;
    int top;
    int capacity;

    public Stack(int capacity) 
    {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) throws StackFullException 
    {
        if (isFull()) 
        {
            throw new StackFullException("Stack is full");
        } 
        else 
        {
            stack[++top] = item;
        }
    }

    public int pop() throws StackEmptyException 
    {
        if (isEmpty()) 
        {
            throw new StackEmptyException("Stack is empty");
        } 
        else 
        {
            return stack[top--];
        }
    }

    public boolean isEmpty() 
    {
        return top == -1;
    }

    public boolean isFull() 
    {
        return top == capacity - 1;
    }

    public int peek() 
    {
        return stack[top];
    }

    public void display() 
    {
        for (int i = top; i >= 0; i--) 
        {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

class StackFullException extends Exception 
{
    public StackFullException(String s) 
    {
        super(s);
    }
}

class StackEmptyException extends Exception 
{
    public StackEmptyException(String s) 
    {
        super(s);
    }
}

public class lab8_8 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the stack");
        int capacity = sc.nextInt();
        Stack s = new Stack(capacity);
        int choice = 0;
        while (choice != 4) 
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the element to be pushed");
                    int item = sc.nextInt();
                    try 
                    {
                        s.push(item);
                    } 
                    catch (StackFullException e) 
                    {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try 
                    {
                        System.out.println("Popped element is " + s.pop());
                    } 
                    catch (StackEmptyException e) 
                    {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Peeked element is " + s.peek());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
