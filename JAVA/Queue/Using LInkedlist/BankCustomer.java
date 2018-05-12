//  To write a program, using a queue data type, to simulate a bank where customers are served on a firstcome-first-serve basis.
import java.util.Queue;
import java.util.Scanner;
class User
{
    String name;
    int amount;
    public User(String n,int a)
    {
        name=n;
        amount=a;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Amount : "+amount);
    }
}
class UserQueue
{
    private int front,rear,size;
    private User data[];
    public UserQueue(int s)
    {
        front=-1;
        rear=-1;
        size=s;
        data=new User[size];
    }
    public void insert(User u)
    {
        if(rear==size-1)
        {
            System.out.println("The Queue is full");
        }
        else if (front==-1)
        {
            front=0;
            rear=0;
            data[rear]=u;
        }
        else
        {
            rear++;
            data[rear]=u;
        }
    }
    public User delete()
    {
        if(front==-1)
        {
            front=rear=-1;
            System.out.println("The Queue is Empty");
            return null;
        }
        else
        {
            front++;
            return data[front-1];
        }
    }
}
public class BankCustomer
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of users : ");
        int size = sc.nextInt();
        System.out.println("Enter the amount in bank : ");
        int money = sc.nextInt();
        System.out.println("Enter the name and withdrawal amount of all users : ");
        UserQueue queue = new UserQueue(size);
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Name : ");
            String name = sc.nextLine();
            name=sc.nextLine();
            System.out.print("Withdrawal Amount : ");
            int amount = sc.nextInt();
            queue.insert(new User(name, amount));
        }
        while(money>0)
        {
            User user= queue.delete();
            if (user.amount<=money) 
            {
                money=money - user.amount;
                System.out.println("Money is alloted to : ");
                user.display();
            }
            else
            {
                System.out.println("Insufficent Balance for others.Go home.");
                break;
            }
        }
        System.out.println("Remaining amount : "+money);
   }
}
