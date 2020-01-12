package AlgorithmBook.sort.priorityQueue;

public class MaxPQ {
	
	private static int[] pq;
	private static int count;
	
	public MaxPQ(int capability) {
		pq = new int[capability+1];
		count = 0;
	}
	
	public static void insert(int val) {
		pq[++count] = val;
		swim(count);
	}
	
	private static void swim(int k) {
		while(k>1 && less(k/2, k)) {
			exch(k, k/2);
			k = k/2;
		}
	}
	
	private static boolean less(int k1, int k2) {
		return pq[k1] < pq[k2];
	}
	
	private static void exch(int k1, int k2) {
		int tmp = pq[k1];
		pq[k1] = pq[k2];
		pq[k1] = tmp;
	}
}
