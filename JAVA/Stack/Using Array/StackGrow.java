//  To implement an integer stack data type that grows on demand.

import java.util.Scanner;

class IntStack {

    private int capacity, top;
    private int data[];
    public IntStack()
    {
        capacity = 1;
        data = new  int[capacity];
        top = -1;
    }
    private void extend()
    {
        int newCapacity = capacity * 2;
        int newData[] = new int[newCapacity];
        for (int i=0; i < data.length; i++)
            newData[i] = data[i];
        capacity = newCapacity;
        data = newData;
    }
    public void push(int value)
    {
        if (top < capacity-1)
        {
            top++;
            data[top] = value;
            System.out.println("Element pushed\n");
        }
        else {
            System.out.println("\tStack Overflow! Extending...\n");
            extend();
            push(value);
        }
    }
    void display()
    {
        System.out.println("Stack: ");
            for (int i = top; i >=0 ; i--)
                    System.out.print(" | " + data[i]);
            System.out.println();
    }
}
public class StackGrow {

    public static void main(String[] args) {

        IntStack istack = new IntStack();
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter the element to push. Enter -999 to stop.");
        do {
            num = scan.nextInt();
            if (num != -999)
                istack.push(num);
        } while (num != -999);
        istack.display();
        scan.close();
    }
}