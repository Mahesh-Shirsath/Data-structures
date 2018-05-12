
//  To write one program for each of the following operations with singly linked lists:
//      b. Free all nodes in a linked list
import java.util.LinkedList;
import java.util.Scanner;

public class freeAll {
    public static void freeAll(LinkedList sl) {
        while (!sl.isEmpty()) {
            sl.remove();
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
        freeAll(sl);
        System.out.println("Linked list : " + sl.toString());

        sc.close();
    }
}