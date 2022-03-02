package linklistpkg;

import java.io.*;
import java.util.*;

class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class LinkListUC1 {
    
	public static void main(String[] args) {
		
		System.out.println("Welcome To LinkedList Program");
		Node firstnode = new Node(56);
		Node secondnode = new Node(30);
		Node thirdnode = new Node(70);
		// created a head variable to store the first node address then we are storing
		// the address of next nodes in variable next
		Node head = firstnode;
		firstnode.next = secondnode;
		secondnode.next = thirdnode;
		Node temp = head;
		// storing the head address into temp variable for print the values.
		while (temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		
	}
}
