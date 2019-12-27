package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Leetcode406 {
	private static int[][] solution(int[][] people) {
		Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[]a,int[]b){
                if(a[0] == b[0])
                    return a[1]-b[1];
                else
                    return b[0]-a[0];
            }
        });
		
		for(int i=0; i<people.length; i++) {
			System.out.print(Arrays.toString(people[i]));
		}
		System.out.println("\n**********************");
		
		ArrayList<int[]> res = new ArrayList<int[]>();
        for(int[] p : people){
            res.add(p[1],p);
            
            for(int i=0; i<res.size(); i++) {
            	System.out.println(res.get(i)[0] + ", " +res.get(i)[1]);
            }
            System.out.println("\n!!!!!!!!!!!!!!!!");
        }
		
		return res.toArray(new int[people.length][2]);
	}
	
	public static void main(String[] args) {
		int[][] people = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		
		for(int i=0; i<people.length; i++) {
			System.out.print(Arrays.toString(people[i]));
		}
		
		System.out.println("\n**********************");
		
		int[][] result = solution(people);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(Arrays.toString(result[i]));
		}
		
	}
}
