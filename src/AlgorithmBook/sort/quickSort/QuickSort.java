package AlgorithmBook.sort.quickSort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] nums = new int[] {5,2,3,1,4};
		System.out.println(Arrays.toString(nums));
		quickSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	private static void quickSort(int[] nums) {
		sort(nums, 0, nums.length-1);
	}
	
	private static void sort(int[] nums, int low, int high) {
		if(low < high) {
			int pivot = partition(nums, low, high);
			
			sort(nums, low, pivot-1);
			sort(nums, pivot+1, high);
		}
	}
	
	private static int partition(int[] nums, int low, int high) {
		
		int pivot = nums[high];
		
		int i=low-1;
		for(int j=low; j<high; j++) {
			if(nums[j] < pivot) {
				i++;
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
		
		int tmp = nums[i+1];
		nums[i+1] = nums[high];
		nums[high] = tmp;
		
		return i+1;
	}
}
