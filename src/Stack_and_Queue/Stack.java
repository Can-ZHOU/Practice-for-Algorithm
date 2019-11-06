package Stack_and_Queue;

/**
 *  Top of stack is the first element
 *  Push:add
 *  Pop:delete
 */

public class Stack {
	private class Node {
		String item;
		Node next;
	} 
	
	private Node first = null;
	
	public void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
