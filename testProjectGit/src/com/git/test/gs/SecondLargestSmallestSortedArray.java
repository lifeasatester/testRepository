package com.git.test.gs;

public class SecondLargestSmallestSortedArray {

	int arr[] = {5,6,7,2,3,4};
		
	public static void main(String[] args) {
		
		SecondLargestSmallestSortedArray sls = new SecondLargestSmallestSortedArray();
		//int min = sls.Smallest();
		//System.out.println("Minimum: " + min);
		
		int piv = sls.SmallestBinarySearch();
		System.out.println("Binary Seach pivot index: " + piv);
		System.out.println("Binary Seach Min Value in Array: " + sls.arr[piv]);
		
	}

	public int Largest() {
		int sl;
		sl=0;
		
		return sl;
	}
	
	public int Smallest() {
		int min, ss, pivot;
		ss=0;
		
		min = arr[0];
		for (int i=1;i<arr.length;i++) {
			if (arr[i] < min) {
				min=arr[i];
				pivot =i;
				break;
			}
		}
		
		return min;
	}

	
	public int SmallestBinarySearch() {
						
		int start = 0;
		int end = arr.length - 1;
		int pivot = 0;
		
		if(arr.length == 1) {
			return pivot;			
		}
		
		// If array is sorted and not rotated...
		if(arr[0] < arr[end]) {
			return pivot;
		}
		
		// array is rotated atleast once.. 
		while (start <=end) {
			
			int mid = (start + end)/2;
		
			if (arr[mid]>arr[mid+1]) {
				pivot = mid + 1;
				return pivot;
			}
			else {
				if(arr[start]<=arr[mid]) {
					start = mid + 1;
				}
				else {
					end  = mid -1;
				}
			}
			
		}
		return pivot;	
	}
	

	public int SecondSmallest() {
		return -1;	
	}
	
	
	public int SecondLargest() {
		int sl;
		sl=0;
		
		return sl;
	}
	
}
