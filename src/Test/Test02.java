package Test;

public class Test02 {
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		ListNode input = new ListNode(3);
		input.next = new ListNode(2);
		input.next.next = new ListNode(0);
		input.next.next.next = new ListNode(-4);
		input.next.next.next.next = input.next;
		ListNode res = detectCycle(input);
		System.out.println(res.val);
	}
	
	public static ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) {
            return null;
        }
        ListNode fast = head, slow = head;
        boolean hasCycle = false;
        while(fast != null && slow != null) {
            slow = slow.next;
            if(fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            if(fast == slow) {
            	System.out.println("hi");
            	hasCycle = true;
                break;
            }
        }
        
        if(!hasCycle) {
        	return null;
        } 
        
        ListNode point1 = fast;
        ListNode point2 = head;
        while(point1 != point2) {
            point1 = point1.next;
            point2 = point2.next;
        }
        
        return point1;
    }
}
