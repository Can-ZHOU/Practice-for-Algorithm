package Sort;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int[] nums) {
		if(nums.length == 1 || nums.length == 0) {
			return;
		}
		for(int i=1; i<nums.length; i++) {
			if(nums[i] < nums[i-1]) {
				int tmp = nums[i];
				int j;
				for(j=i-1; j>=0&&nums[j]>tmp; j--) {
					nums[j+1] = nums[j];
				}
				nums[j+1] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {5,3,4,1,6,2};
		insertSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
