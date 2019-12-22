package Sort;

/**
 * @author ZC
 *
 * find two elements in an ordered array (a, b), and a+b = sum;
 * O(n)
 */
public class Sum {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		int sum = 11;
		
		int p1 = 0;
		int p2 = array.length-1;
		
		while(p1<p2 && array[p1]+array[p2]!=sum) {
			if(array[p1]+array[p2] > sum) {
				p2--;
			} else if(array[p1]+array[p2] < sum) {
				p1++;
			}
		}
		
		if(p1==p2) {
			if(array[p1]+array[p2] != sum) {
				System.out.println("Cannot find.");
			} else {
				System.out.println("a and b are same: " + array[p1]);
			}
		} else {
			System.out.println("a is: " + array[p1] + " and b is: " + array[p2]);
		}

	}
}
