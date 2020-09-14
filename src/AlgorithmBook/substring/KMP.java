package AlgorithmBook.substring;

public class KMP {
	private static int R;
	private static int[][] dfa;
	

	public static void main(String[] args) {
		String txt = "cedfaddfec";
		String pat = "dfa";
		System.out.println("index is " + search(pat, txt));
	}

	public static int search(String pat, String txt) {
		buildKMP(pat);
		
		int m = pat.length();
		int n = txt.length();
		
		int i, j;
		for(i=0, j=0; i<n && j<m; i++) {
			j=dfa[txt.charAt(i)][j];
		}
		
		if(j == m) {
			return i-m;
		} else {
			return -1;
		}
	}
	
	public static void buildKMP (String pat) {
		R = 256;
		int m = pat.length();
		dfa = new int[R][m];
		dfa[pat.charAt(0)][0] = 1;
		for(int x=0, j=1; j<m; j++) {
			for(int c=0; c<R; c++) {
				dfa[c][j] = dfa[c][x];
			}
			dfa[pat.charAt(j)][j] = j+1;
			x = dfa[pat.charAt(j)][x];
		}
	}
}
