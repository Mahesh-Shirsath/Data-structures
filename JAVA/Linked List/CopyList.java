/*Program for copying one linked list into another one*/

import java.util.LinkedList;
import java.util.Scanner;

public class CopyList
 {
    public static LinkedList copyList(LinkedList sl1) {
        LinkedList sl2 = new LinkedList<Integer>();
        int data;
        for (int i = 0; i < sl1.size(); i++) {
            data = (Integer) sl1.get(i);
            sl2.add(data);
        }
        return sl2;
    }

    public static void main(String[] args) {
        LinkedList sl1 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements for linked list : ");
        int num = sc.nextInt();
        System.out.println("Enter elements : ");
        int data;
        for (int i = 0; i < num; i++) {
            data = sc.nextInt();
            sl1.add(data);
        }

        System.out.println("Linked list 1 : " + sl1.toString());
        LinkedList sl2 = copyList(sl1);
        System.out.println("Linked list 2 : " + sl2.toString());

        sc.close();
    }
}