package Past_Etask.S2;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {4,2,5,1,3};
		bubble(array);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void bubble(int[] array) {
		int len = array.length;
		for(int i=1; i<len; i++) {
			for(int j=0; j<len-i; j++) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}

}
