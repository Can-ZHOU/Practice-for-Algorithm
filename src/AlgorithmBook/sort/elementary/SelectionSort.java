package AlgorithmBook.sort.elementary;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,1,3,2,4};
		System.out.println(Arrays.toString(nums));
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	private static void selectionSort(int[] nums) {
		int len = nums.length;
		if(len == 0) {
			return;
		}
		for(int i=0; i<len; i++) {
			int min = i;
			for(int j=i+1; j<len; j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			int tmp = nums[min];
			nums[min] = nums[i];
			nums[i] = tmp;
		}
	}
}
