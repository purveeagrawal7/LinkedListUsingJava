package dataStructure;
class LinkedList 
{ 
 Node head;  // head of list 
 static class Node { 
     int data; 
     Node next; 
     Node(int d)  { 
    	 data = d;  
    	 next=null;
    } 
 } 
 public void printList(Node n) {
	 while(n != null) {
		 System.out.println(n.data);
		 n = n.next;
	 }
 }
 public void push(int new_data) 
 { 	 
     /* 1 & 2: Allocate the Node & 
               Put in the data*/
     Node new_node = new Node(new_data); 
     /* 3. Make next of new Node as head */
     new_node.next = head;   
     /* 4. Move the head to point to new Node */
     head = new_node; 
 }
 public void insertAfter(Node prev_node, int new_data) 
 { 
     Node new_node = new Node(new_data); 
     new_node.next=prev_node.next;
     prev_node.next=new_node;
     
 }
 public void append(int new_data) 
 { 
	 Node last=head;
	 while(last.next!=null) {
		 last=last.next;
	 }	 
	 Node new_node = new Node(new_data);
	 last.next=new_node;
	 new_node.next=null;
 }
 public int findMiddle(Node node) {
	 Node fp=node;
	 Node sp=node;
	 while(fp.next!=null) {
		 fp=fp.next.next;
		 sp=sp.next;
	 }
		return sp.data;
 }
 public Node reverse(Node node) 
 { 
	 Node prev=null;
	 Node next=null;
	 Node curr=node;
	 while(curr!=null) {
		 next=curr.next;
		 curr.next=prev;
		 prev=curr;
		 curr=next;
	 }
	 node=prev;
	 return node;
 }
 /* method to create a simple linked list with 3 nodes*/
 public static void main(String[] args) 
 { 
     /* Start with the empty list. */
     LinkedList llist = new LinkedList(); 
     llist.head  = new Node(1); 
     Node second = new Node(2); 
     Node third  = new Node(3); 
     Node fourth  = new Node(4); 
     Node fifth  = new Node(5); 
    // Node sixth  = new Node(6); 
     llist.head.next = second; // Link first node with the second node 
     second.next = third; // Link second node with the third node 
     third.next=fourth;
     fourth.next=fifth;
     fifth.next=null;
    // sixth.next= null;
    // llist.reverse(llist.head);
     Node head=llist.reverse(llist.head);
     System.out.println("Middle element of Linked List"+llist.findMiddle(head));
     llist.printList(head);
 } 
} 

