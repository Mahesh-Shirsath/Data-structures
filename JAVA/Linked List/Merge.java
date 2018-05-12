//  To write one program for each of the following operations with singly linked lists:
//      a. Concatenate two linked list and create third one.

import java.util.LinkedList;
import java.util.Scanner;

public class Merge {
    public static LinkedList concatList(LinkedList sl1, LinkedList sl2) {
        LinkedList sl3 = new LinkedList<Integer>();
        int data;
        for (int i = 0; i < 5; i++) {
            data = (Integer) sl1.get(i);
            sl3.add(data);
        }
        for (int i = 0; i < 7; i++) {
            data = (Integer) sl2.get(i);
            sl3.add(data);
        }
        return sl3;
    }
    public static void main(String[] args) {
        LinkedList sl1 = new LinkedList<Integer>();
        System.out.println("Enter five elements for linked list 1 : ");
        Scanner sc = new Scanner(System.in);
        int data;
        for (int i = 0; i < 5; i++) {
            data = sc.nextInt();
            sl1.add(data);
        }

        LinkedList sl2 = new LinkedList<Integer>();
        System.out.println("Enter seven elements for linked list 2 : ");
        for (int i = 0; i < 7; i++) {
            data = sc.nextInt();
            sl2.add(data);
        }
        System.out.println("Concatenated list : " + concatList(sl1, sl2).toString());
        sc.close();
    }
}