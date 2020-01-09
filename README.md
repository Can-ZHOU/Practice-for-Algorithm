# Practice-for-Algorithm
### [Reference](https://algs4.cs.princeton.edu/21elementary/)
## Table of contents
- [Sorting](#sort)
    - [Elementary Sorts](#sort-elementary)
        - [Seletion Sort](#sort-elementary-seletion)
        - [Insertion Sort](#sort-elementary-insertion)
        - [Shell Sort](#sort-elementary-shell)
	- [Mergesort](#sort-merge)
		- [Merge Sort](#sort-merge-basic)

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
#### Mergesort <a name="sort-merge"></a>
- Merge Sort <a name="sort-merge-basic"></a>
	- Find the middle point to divide the array into two halves.
	- Call mergeSort for first half.
	- Call mergeSort for second half.
	- Merge the two halves sorted in step 2 and 3.
	- Code:
	```java
	import java.util.Arrays;
	
	public class Mergesort {
		public static void main(String[] args) {
			int[] nums = new int[] {5,3,1,2,4};
			System.out.println(Arrays.toString(nums));
			mergesort(nums);
			System.out.println(Arrays.toString(nums));
		}
		
		private static void mergesort(int[] nums) {
			sort(nums, 0, nums.length-1);
		}
		
		private static void sort(int[] nums, int left, int right) {
			if(left < right) {
				int middle = (left + right)/2;
				sort(nums, left, middle);
				sort(nums, middle+1, right);
				merge(nums, left, middle, right);
			} else {
				return;
			}
		}
		
		private static void merge(int[] nums, int left, int middle, int right) {
			int len_l = middle-left+1;
			int len_r = right-middle;
			
			int[] n1 = new int[len_l];
			int[] n2 = new int[len_r];
			
			for(int i=0; i<len_l; i++) {
				n1[i] = nums[left+i];
			}
			for(int i=0; i<len_r; i++) {
				n2[i] = nums[middle+1+i];
			}
			
			int i=0, j=0, k=left;
			while(i<len_l && j<len_r) {
				if(n1[i]<=n2[j]) {
					nums[k] = n1[i];
					i++;
				} else {
					nums[k] = n2[j];
					j++;
				}
				k++;
			}
			
			while(i<len_l) {
				nums[k] = n1[i];
				i++;
				k++;
			}
			while(j<len_r) {
				nums[k] = n2[j];
				j++;
				k++;
			}
		}
	}
	```