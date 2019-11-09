package Past_Etask;
public class CountCommon {

	static class LNode {
		public int data;
		public LNode next;
		public LNode(int d, LNode nxt) {
			data = d;
			next = nxt;
		}
	}
	
	/**
	 * Worst-case asymptotic is   Theta(N*M).
	 * 
	 * There has two while loops.
	 * The worst case is there is no common element and each element in list1 is greater than list2.
	 * For each inner while loop, there has two if statement which will cost 2*Theta(1) = Theta(1)
	 * And there are M element in list2;
	 * so, the inner loop will cost M*Theta(1) = Theta(M)
	 * For each outer while loop element, the inner while loop will go through the list2.
	 * And there are N element in list1.
	 * So, it will cost N*Theta(M) = Theta(N*M)
	 * Thus, worst-case asymptotic is Theta(N*M).
	 */
	public static Integer countCommon (LNode head1, LNode head2 ) {
		LNode copy_head2 = head2;
		int count = 0;
		
		// Go through the outer loop.
		while (head1!=null) {
			
		// Go through the inner loop.
			while(copy_head2!=null) {
				
				// As the list is in ascending order
				// If the current list1 data is smaller than current list2 data,
				// Then, the current list1 data won't have common with the rest list2 data.
				if(head1.data < copy_head2.data) {
					break;
				}
				
				// If is common data, count++
				if(head1.data == copy_head2.data) {
					count++;
				}
				
				copy_head2 = copy_head2.next;
			}
			
			head1 = head1.next;
			copy_head2 = head2;
		}
		return count;
	}
	
	public static void main(String[] args) {
		LNode list1 = new LNode(0, new LNode(1, new LNode(2, null)));
		LNode list2 = new LNode(1, new LNode(2, new LNode(3, null)));
		LNode list3 = new LNode(0, new LNode(1, new LNode(2, null)));
		LNode list4 = new LNode(0, new LNode(1, new LNode(2, new LNode(3, null))));
		LNode list5 = new LNode(0, new LNode(3, null));
		LNode list6 = null;
		
		System.out.println("should_return_2: " + countCommon(list1, list2));
		System.out.println("should_return_3: " + countCommon(list1, list3));
		System.out.println("should_return_3: " + countCommon(list1, list4));
		System.out.println("should_return_1: " + countCommon(list1, list5));
		System.out.println("should_return_0: " + countCommon(list1, list6));
	}
}
