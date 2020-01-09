# Practice-for-Algorithm
### [Reference](https://algs4.cs.princeton.edu/21elementary/)
## Table of contents
- [Sorting](#sort)
    - [Elementary Sorts](#sort-elementary)
        - [Seletion Sort](#sort-elementary-seletion)
        - [Insertion Sort](#sort-elementary-insertion)
        - [Shell Sort](#sort-elementary-shell)

### Sorting <a name="sort"></a>
#### Elementary Sorts <a name="sort-elementary"></a>
- Selection Sort <a name="sort-elementary-seletion"></a>
    - Find the smallest item in the array, and exchange it with the first entry.
    -  Find the next smallest item and exchange it with the second entry.
    - Continue in this way until the entire array is sorted. 
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
- Insertion Sort <a name="sort-elementary-insertion"></a>
    - Select the fisrt unsorted element.
    - Swap other elements to the right to create the correct position and shift the unsort element.
    - Advance the maker to the right one element.
    - Code:
    ```java
    import java.util.Arrays;

    public class InsertionSort {
    	public static void main(String[] args) {
    		int[] nums = new int[] {5,2,3,1,4};
    		System.out.println(Arrays.toString(nums));
    		insertionSort(nums);
    		System.out.println(Arrays.toString(nums));
    	}
    
    	private static void insertionSort(int[] nums) {
    		int len = nums.length;
    		if(len==0 || len==1) {
    			return;
    		}
    		for(int i=1; i<len; i++) {
    			if(nums[i]<nums[i-1]) {
    				int tmp = nums[i];
    				int j = 0;
    				for(j=i-1; j>=0&&nums[j]>tmp; j--) {
    					nums[j+1] = nums[j];
    				}
    				nums[j+1] = tmp;
    			}
    		}
    	}
    }
    ```
- Shell Sort <a name="sort-elementary-shell"> </a>
    - Shellsort is a simple extension of insertion sort that gains speed by allowing exchanges of entries that are far apart, to produce partially sorted arrays that can be efficiently sorted, eventually by insertion sort.
    - Code:
    ```java
    import java.util.Arrays;
    
    public class ShellSort {
    	public static void main(String[] args) {
    		int[] nums = new int[] {5,2,3,1,4};
    		System.out.println(Arrays.toString(nums));
    		shellSort(nums);
    		System.out.println(Arrays.toString(nums));
    	}
    
    	private static void shellSort(int[] nums) {
    		int len = nums.length;
    		if(len==0 || len==1) {
    			return;
    		}
    
    		for(int gap=len/2; gap>0; gap/=2) {
    			for(int i=gap; i<len; i++) {
    				int tmp = nums[i];
    				int j;
    				for(j=i; j>=gap && nums[j-gap]>tmp; j-=gap) {
    					nums[j] = nums[j-gap];
    				}
    				nums[j] = tmp;
    			} 
    		}
    	}
    }
    ```