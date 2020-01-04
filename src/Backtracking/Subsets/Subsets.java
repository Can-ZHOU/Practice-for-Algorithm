package Backtracking.Subsets;

import java.util.ArrayList;
import java.util.List; 

public class Subsets {
	public static void main(String[] args) {
		int[] input = new int[] {1,2,3};
		List<List<Integer>> output = subsets(input);
		for(List<Integer> ls : output) {
			System.out.println(ls);
		}
	}
	
	private static List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<>();
		backtrack(0, nums, res, new ArrayList<Integer>());
		return res;
	}
	
	private static void backtrack(int start, int[] nums, List<List<Integer>> res, List<Integer> tempList) {
		res.add(new ArrayList<Integer>(tempList));
		for(int i=start; i<nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(i+1, nums, res, tempList);
			tempList.remove(tempList.size()-1);
		}
	}
}
