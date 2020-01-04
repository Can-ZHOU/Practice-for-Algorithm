package ImageRotation;

import java.util.Arrays;

public class ClockwiseRotation {
	public static void main(String[] args) {
		int[][] nums = new int[][] {{1,2,3},{4,5,6}, {7,8,9}};
		printArray(nums);
		
		clockwiseRotation(nums);
		
		printArray(nums);
	}
	
	private static void printArray(int[][] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
		System.out.println("*********");
	}
	
	private static void clockwiseRotation(int[][] nums) {
		int size = nums.length;
		
		for(int i=0; i<size/2; i++) {
			for(int j=0; j<size; j++) {
				int tmp = nums[i][j];
				nums[i][j] = nums[size-1-i][j];
				nums[size-1-i][j] = tmp;
			}
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<i; j++) {
				int tmp = nums[i][j];
				nums[i][j] = nums[j][i];
				nums[j][i] = tmp;
			}
		}
	}
}
