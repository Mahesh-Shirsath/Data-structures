
//      c. Reverse a linked list
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinked {
    public static LinkedList reverse(LinkedList sl) {
        LinkedList rev = new LinkedList<Integer>();
        for (int i = sl.size()-1; i >= 0; i--) {
            int data = (Integer) sl.get(i);
            rev.add(data);
        }
        return rev;
    }

    public static void main(String[] args) {
        LinkedList sl = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements for linked list : ");
        int num = sc.nextInt();
        System.out.println("Enter elements : ");
        int data;
        for (int i = 0; i < num; i++) {
            data = sc.nextInt();
            sl.add(data);
        }

        System.out.println("Linked list : " + sl.toString());
        LinkedList revList = reverse(sl);
        System.out.println("Reversed Linked list : " + revList.toString());

        sc.close();
    }
}
