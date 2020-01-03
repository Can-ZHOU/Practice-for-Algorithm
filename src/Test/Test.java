package Test;

import java.util.ArrayList;

public class Test {
//	static class Node {
//		public int val;
//		public Node next;
//		Node(int val) {
//			this.val = val;
//			this.next = null;
//		}
//		
//	}
//	static class ListNode {
//		      int val;
//		      ListNode next;
//		      ListNode(int x) { val = x; }
//	}
//	public static Node reverse(Node head) {
//		Node pre = null;
//		Node cur = head;
//		Node next = null;
//		
//		while(cur!=null) {
//			next = cur.next;
//			cur.next = pre;
//			pre = cur;
//			cur = next;
//		}
//		
//		return pre;
//	}
//	
//	public static void printNode(Node head) {
//		while(head!=null) {
//			System.out.print(head.val);
//			head = head.next;
//		}
//		System.out.println("\n***************************");
//	}
//	
//	public int[] nextLargerNodes(ListNode head) {
//        ListNode tmp;
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        while(head!=null) {
//            int val = head.val;
//            int next_larger=0;
//            tmp = head.next;
//            while(tmp!=null) {
//                if(tmp.val > val) {
//                    next_larger = tmp.val;
//                    break;
//                }
//            }
//            res.add(next_larger);
//        }
//        int[] result = new int[res.size()];
//        result = res.toArray();
//        return result;
//    }
	
	public static int maxUncrossedLines(int[] A, int[] B) {
        return maxUncrossedLines(A, B, A.length-1, B.length-1);
    }
    
    public static int maxUncrossedLines(int[] A, int[] B, int a, int b) {
        if(a == 0 || b == 0) {
            return 0;
        }
        System.out.println(a+"__"+b);
        if(A[a]==B[b]) {
            return 1+maxUncrossedLines(A, B, a-1, b-1);
        } else {
            int dp_1 = maxUncrossedLines(A, B, a-1, b);
            int dp_2 = maxUncrossedLines(A, B, a, b-1);
            return Math.max(dp_1, dp_2);
        }
    }
	
	public static void main(String[] args) {
//		Node head = new Node(0);
//		head.next = new Node(1);
//		head.next.next = new Node(2);
//		head.next.next.next = new Node(3);
//		printNode(head);
//		Node res = reverse(head);
//		printNode(res);
		int[] A = new int[] {1,2,4,1,4,4,3,5,5,1,4,4,4,1,4,3,4,2,4,2};
		int[] B = new int[] {2,4,1,1,3,5,2,1,5,1,2,3,3,2,1,4,1,2,5,5};
		int res = maxUncrossedLines(A, B);
		System.out.println(res);
	}
}


