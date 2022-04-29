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

	@SuppressWarnings({ })
	public static void main(String[] args) {
		NthNodeLinkedList ll = new NthNodeLinkedList();
		ll.add(12);
		//ll.add(8);
		//ll.add(42);
		//ll.add(29);
		//ll.add(32);
		//ll.add(87);
		//ll.add(53);
		ll.printNthFromEnd(12);
	}

}
