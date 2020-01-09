package AlgorithmBook.sort.mergeSort;

import java.util.Arrays;

public class Mergesort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,3,1,2,4};
		System.out.println(Arrays.toString(nums));
		mergesort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	private static void mergesort(int[] nums) {
		sort(nums, 0, nums.length-1);
	}
	
	private static void sort(int[] nums, int left, int right) {
		if(left < right) {
			int middle = (left + right)/2;
			sort(nums, left, middle);
			sort(nums, middle+1, right);
			merge(nums, left, middle, right);
		} else {
			return;
		}
	}
	
	private static void merge(int[] nums, int left, int middle, int right) {
		int len_l = middle-left+1;
		int len_r = right-middle;
		
		int[] n1 = new int[len_l];
		int[] n2 = new int[len_r];
		
		for(int i=0; i<len_l; i++) {
			n1[i] = nums[left+i];
		}
		for(int i=0; i<len_r; i++) {
			n2[i] = nums[middle+1+i];
		}
		
		int i=0, j=0, k=left;
		while(i<len_l && j<len_r) {
			if(n1[i]<=n2[j]) {
				nums[k] = n1[i];
				i++;
			} else {
				nums[k] = n2[j];
				j++;
			}
			k++;
		}
		
		while(i<len_l) {
			nums[k] = n1[i];
			i++;
			k++;
		}
		while(j<len_r) {
			nums[k] = n2[j];
			j++;
			k++;
		}
	}
}
