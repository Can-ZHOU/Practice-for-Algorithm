package Stack_and_Queue;

/**
 *  Front of queue is the fist node.
 *  Back of queue is the last node.
 *  Dequeue from first.
 *  Enqueue after last
 */

public class Queue {
	private class Node {
		String item;
		Node next;
	}
	
	private Node first = null, last = null;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void enqueue(String item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;
		}
	}
	
	public String dequeue() {
		String item = first.item;
		first = first.next;
		if(isEmpty()) {
			last = null;
		}
		return item;
	}
}
