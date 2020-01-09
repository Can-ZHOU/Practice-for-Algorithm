package AlgorithmBook.sort.elementary;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,2,3,1,4};
		System.out.println(Arrays.toString(nums));
		shellSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	private static void shellSort(int[] nums) {
		int len = nums.length;
		if(len==0 || len==1) {
			return;
		}
		
		for(int gap=len/2; gap>0; gap/=2) {
			for(int i=gap; i<len; i++) {
				int tmp = nums[i];
				int j;
				for(j=i; j>=gap && nums[j-gap]>tmp; j-=gap) {
					nums[j] = nums[j-gap];
				}
				nums[j] = tmp;
			} 
		}
	}
}
