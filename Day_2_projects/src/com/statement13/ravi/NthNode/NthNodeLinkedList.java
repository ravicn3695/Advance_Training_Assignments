package com.statement13.ravi.NthNode;

public class NthNodeLinkedList {

	Nodes head;

	class Nodes {
		int data;
		Nodes next;

		Nodes(int d) {
			data = d;
			next = null;
		}
	}

	void printNthFromEnd(int n) {
		Nodes ptr1 = head;
		Nodes ptr2 = head;

		int count = 0;
		if (head != null) {
			while (count < n) {
				if (ptr2 == null) {
					System.out.println("-1");
					System.out.println(n + " the node from the last doesnt exist");
					return;
				}
				ptr2 = ptr2.next;
				count++;
			}

			if (ptr2 == null) {
				head = head.next;
				if (head != null)
					System.out.println(n + "the node from the last is " + head.data);
			} else {

				while (ptr2 != null) {
					ptr1 = ptr1.next;
					ptr2 = ptr2.next;
				}
				System.out.println(n + "the node from the last is " + ptr1.data);
			}
		}

	}

	public void add(int newData) {
		Nodes newNode = new Nodes(newData);
		newNode.next = head;
		head = newNode;
	}

	
	public static void main(String[] args) {
		NthNodeLinkedList a = new NthNodeLinkedList();
		a.add(12);
		a.add(8);
		a.add(42);
		//a.add(29);
		//a.add(32);
		//a.add(87);
		a.add(53);
		a.printNthFromEnd(8);
	}

}
