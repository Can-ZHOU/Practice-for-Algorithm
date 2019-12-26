package Reverse;



public class SingleLinkedList {
	static class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	private static Node reverse(Node head) {
		
		Node pre = null;
		Node cur = head;
		Node next = null;
		
		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
}
