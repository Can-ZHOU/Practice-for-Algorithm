package Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation_string {
	
	private static void permutation (String prefix, String suffix, List<String> res) {
		if(suffix.length() == 0) {
			res.add(prefix);
		} else {
			for(int i=0; i<suffix.length(); i++) {
				permutation(prefix+suffix.charAt(i), suffix.substring(0, i)+suffix.substring(i+1, suffix.length()), res);
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> res = new ArrayList<String>();
		permutation("", "abc", res);
		System.out.println(res);
	}
}
