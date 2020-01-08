# Practice-for-Algorithm
### [Reference](https://algs4.cs.princeton.edu/21elementary/)
## Table of contents
- [Sorting](#sort)
    - [Elementary Sorts](#sort-elementary)

### Sorting <a name="sort"></a>
#### Elementary Sorts <a name="sort-elemtary"></a>
- Selection Sort
    - Find the smallest item in the array, and exchange it with the first entry.
    -  Find the next smallest item and exchange it with the second entry.
    - Continue in this way until the entire array is sorted. 
    - Proposition:  
        Selection sort uses ~n2/2 compares and n exchanges to sort an array of length n.
    - Code:
    ```java
    import java.util.Arrays;

    public class SelectionSort {
    	public static void main(String[] args) {
    		int[] nums = new int[] {5,1,3,2,4};
    		System.out.println(Arrays.toString(nums));
    		selectionSort(nums);
    		System.out.println(Arrays.toString(nums));
    	}
    
    	private static void selectionSort(int[] nums) {
    		int len = nums.length;
    		if(len == 0) {
    			return;
    		}
    		for(int i=0; i<len; i++) {
    			int min = i;
    			for(int j=i+1; j<len; j++) {
    				if(nums[j] < nums[min]) {
    					min = j;
    				}
    			}
    			int tmp = nums[min];
    			nums[min] = nums[i];
    			nums[i] = tmp;
    		}
    	}
    }
    ```
