//. To implement a character stack data type and use it to reverse a string.

import java.util.Scanner;

class CharStack {

	private int capacity, top;
	private char data[];
	public CharStack(int c) {
		capacity = c;
		data = new  char[capacity];
		top = -1;
	}
	public void push(char value) {
		if (top < capacity-1) {
			top++;
			data[top] = value;
		}
		else
			System.out.println("Stack Overflow\n");
	}
	public char pop() {
		if (top >= 0) {
			top--;
			return data[top+1];
		}
		else {
			System.out.println("Stack Underflow\n");
			return '\0';
		}
	}
    void display() {
        System.out.println("Stack: ");
            for (int i = top; i >=0 ; i--)
                    System.out.print(" | " + data[i]);
            System.out.println();
    }
}
public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		char rev[];

		System.out.print("\nEnter a string : ");
		str = sc.nextLine();

		int len = str.length();
		rev = new char[len];

		CharStack cs = new CharStack(len);
		for (int i = 0; i < len; i++)
			cs.push(str.charAt(i));

		System.out.print("Reverse = ");
		for (int i = 0; i < len; i++)
			rev[i] = cs.pop();
		System.out.println(new String(rev));

		sc.close();
	}
}
