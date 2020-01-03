package Backtracking.Permutaion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation_array {
	private static void permutation(int[] a, int start, ArrayList<int []> res) {
		if(start>=a.length) {
			// why add clone of a ?
			// answer: this add the address of array a, so when a change it will change.
			//		   so we need to clone it.
			res.add(a.clone());
		} else {
			for(int i=start; i<a.length; i++) {
				swap(a, i, start);
				permutation(a, start+1, res);
				swap(a, i, start);
			}
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void main(String[] args) {
		ArrayList<int []> res = new ArrayList<int []>();
		int[] a = new int[] {1,2,3};
		permutation(a, 0, res);
		for(int[] o : res) {
			System.out.println(Arrays.toString(o));
		}
	}
}
