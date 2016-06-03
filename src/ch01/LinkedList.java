package ch01;

public class LinkedList<T> {
	Node head=null;
	int N=0;
	
	@SuppressWarnings("unused")
	private class Node{
		T item;
		Node next;
	}
	
//	public LinkedList<T> (){
//		head=null;
//		N=0;
//	}
	
	public Node addTail(Node head, T item){
		Node newnode=new Node();
		newnode.item=item;
		newnode.next=null;
		if(head==null){
			head=newnode;
			return head;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newnode;
		return head;
	}
	
	public Node addHead(Node head, T item){
		Node newnode=new Node();
		newnode.item=item;
		if(head==null){
			head=newnode;
			head.next=null;
			return head;
		}
		newnode.next=head;
		head=newnode;
		return head;
	}
	
	

}
