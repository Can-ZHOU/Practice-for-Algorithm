package Recursion;

/**
 * @author ZC
 * Using recursion to fix Hanoi tower problem
 */

public class Hanoi {
	
	/**
	 * @param n: the number of disks
	 * @param from: the original rod
	 * @param in:	the transition rod
	 * @param to:	the target rod
	 */
	public static void hanoi(int n, char from, char trans, char to) {
		if (n==1) {
			System.out.println("Put disk 1 from " + from + " to " + to);
		} else {
			hanoi(n-1, from, to, trans);
			System.out.println("Put disk " + n + " from " + from + " to " + trans);
			hanoi(n-1, trans, from, to);
		}
	}
	
	public static void main(String[] args) {
		hanoi(3, 'A', 'B', 'C');
	}
}
