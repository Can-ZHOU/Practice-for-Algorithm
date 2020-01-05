package Backtracking.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int[] candidates = new int[] {2,3,5};
		int target = 8;
		List<List<Integer>> res = combination(candidates, target);
		printList(res);
	}
	
	private static void printList (List<List<Integer>> ls) {
		for(int i=0; i<ls.size(); i++) {
			System.out.println(ls.get(i));
		}
	}
	
	private static List<List<Integer>> combination(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backtrack(res, 0, target, candidates, new ArrayList<Integer>(), 0);
		return res;
	}
	
	private static void backtrack(List<List<Integer>> res, int start, int target, int[] candidates, List<Integer> tmp, int sum) {
		if(sum > target) {
			return;
		}
		if(sum==target) {
			res.add(new ArrayList<Integer>(tmp));
		} else {
			for(int i=start; i<candidates.length; i++) {
				tmp.add(candidates[i]);
				sum += candidates[i];
				backtrack(res, i, target, candidates, tmp, sum);
				sum -= candidates[i];
				tmp.remove(tmp.size()-1);
			}
		}
	}
}
