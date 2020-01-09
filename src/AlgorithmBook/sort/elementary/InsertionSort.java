package AlgorithmBook.sort.elementary;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,2,3,1,4};
		System.out.println(Arrays.toString(nums));
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	private static void insertionSort(int[] nums) {
		int len = nums.length;
		if(len==0 || len==1) {
			return;
		}
		for(int i=1; i<len; i++) {
			if(nums[i]<nums[i-1]) {
				int tmp = nums[i];
				int j = 0;
				for(j=i-1; j>=0&&nums[j]>tmp; j--) {
					nums[j+1] = nums[j];
				}
				nums[j+1] = tmp;
			}
		}
	}
}
