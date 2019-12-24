package Sort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] nums = new int[] {4,2,5,1,7,3,6};
		shellSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void shellSort(int[] nums) {
		for(int d=nums.length/2; d>0; d/=2) {
			for(int i=d; i<nums.length; i++) {
				for(int j=i-d; j>=0; j-=d) {
					if(nums[j] > nums[j+d]) {
						int tmp = nums[j];
						nums[j] = nums[j+d];
						nums[j+d] = tmp;
					}
				}
			}
		}
	}
}
