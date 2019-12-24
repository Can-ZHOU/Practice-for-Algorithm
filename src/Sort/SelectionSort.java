package Sort;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] nums) {
		if(nums.length == 0 || nums.length == 1) {
			return;
		} 
		for(int i=0; i<nums.length; i++) {
			int min = i;
			for(int j=i; j<nums.length; j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[min];
			nums[min] = tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {5,2,3,1,6,4};
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
