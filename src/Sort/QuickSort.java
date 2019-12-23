package Sort;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = array[ (left+right) / 2 ];
		int index = partition(array, left, right, pivot);
		quickSort(array, left, index-1);
		quickSort(array, index, right);
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		while(left<=right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void swap(int[] array, int left, int right) {
		int tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 5, 1, 4, 3, 7, 2};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
