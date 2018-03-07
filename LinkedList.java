package com.rabin.linkedlist;

public class LinkedList {

	Node head;//head of the list
	static class Node{
		int data;
		Node next;
		
		//constructor of class Node
		Node(int d){
			data=d;
			next=null;
		}
	}
	//print the list 
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	public void InsertAtBegin(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
		
	}
	
	public void InsertAfter(Node previous_Node,int new_data) {
		
		if(previous_Node==null) {
			System.out.println("cannot be null");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=previous_Node.next;
		previous_Node.next=new_node;
		
	}
	
	public void InsertAtEnd(int new_data) {
		Node new_node=new Node(new_data);
		if(head==null) {
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList llist=new LinkedList();
		llist.head= new Node(1);
		Node second =new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		
		llist.head.next=second;
		second.next=third;
		third.next=fourth;
		
		llist.printList();
		
		llist.InsertAtBegin(5);
		llist.printList();
		
		llist.InsertAfter(third,7);
		llist.printList();
		
		llist.InsertAtEnd(8);
		llist.printList();
	}

}
