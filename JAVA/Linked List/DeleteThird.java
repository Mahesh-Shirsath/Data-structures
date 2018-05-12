//  To delete every third element from the linked list.
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteThird {
    public static void deleteThird(LinkedList sl) {
        for (int i = 0; i < sl.size(); i+=3) {
            sl.remove(i);
        }
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
        deleteThird(sl);
        System.out.println("Linked list : " + sl.toString());

        sc.close();
    }
}