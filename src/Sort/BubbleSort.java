package Sort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubble (int[] nums) {
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {5,7,2,1,3,5,8};
		System.out.println(Arrays.toString(nums));
		bubble(nums);
		System.out.println(Arrays.toString(nums));
	}
}
