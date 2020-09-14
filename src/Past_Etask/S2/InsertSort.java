package Past_Etask.S2;

public class InsertSort {
	
	public static void main(String[] args) {
		int[] array = {3,5,2,4,1};
		insert(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static void insert(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}

}
