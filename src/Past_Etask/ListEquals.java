package Past_Etask;

public class ListEquals {

	static class LNode {
		public int data;
		public LNode next;
		public LNode(int d, LNode nxt) {
			data = d;
			next = nxt;
		}
	}
	public static boolean listEquals (LNode head1, LNode head2) {
		while(head1!=null) {
			if (head2==null) {
				return false;
			}
			if(head1.data!=head2.data) {
				return false;
			} else {
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		if(head2!=null) {
			return false;
		}else {
			return true;
		}
	}
	
	public static  void main (String[] args) {
		LNode list1 =new LNode(0,new LNode(1,new LNode(2,null)));
		LNode list2 =new LNode(0,new LNode(1,new LNode(2,null)));
		LNode list3 =new LNode(0,new LNode(88,new LNode(2,null)));
		LNode list4 =new LNode(0,new LNode(1,null));
		System.out.println("shouldbetrue:"  + listEquals(list1, list2));
		System.out.println("shouldbefalse:" + listEquals(list1, list3));
		System.out.println("shouldbefalse:" + listEquals(list1, list4));
		System.out.println("shouldbefalse:" + listEquals(list1,null));
	}
}
