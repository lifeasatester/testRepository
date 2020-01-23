package com.git.test.gs;

public class SecondLargestSmallest {

	//{34,10,12,55,123,7,11};
	//{1,1,1,1,1}
	public int[] arr = {34,10,12,55,123,7,11};
	
	
	public static void main(String[] args) {

		SecondLargestSmallest sls = new SecondLargestSmallest();
		
		// Second Smallest Number		
		int ss = sls.secondSmallest_2();
		if (ss == -1)
			System.out.println("Invalid array size for finding second smallest element");
		else
			System.out.println("Second smallest: " + ss);
		
		// Second Largest Number
		
		int sh = sls.secondLargest();
		if (sh == -1)
			System.out.println("Invalid array size for finding second highest element");
		else
			System.out.println("Second Highest: " + sh);
	}

	
	
	public int secondLargest() {
		
		if(arr.length<2)
			return -1;
		
		int fHigh = Integer.MIN_VALUE;
		int sHigh = Integer.MIN_VALUE;
		
		for (int i = 0; i<arr.length;i++) {
			
			if(arr[i] > fHigh) {
				sHigh = fHigh;
				fHigh = arr[i];
			}

			else if (arr[i]>sHigh)
				sHigh = arr[i];
		}
		
		return sHigh;
	}
	

public int secondSmallest() {
		
		if(arr.length<2)
			return -1;
		
		int fSmall = Integer.MAX_VALUE;
		int sSmall = Integer.MAX_VALUE;
				
		for (int i = 0; i<arr.length;i++) {
			
			if(arr[i] < fSmall) {
				sSmall = fSmall;
				fSmall = arr[i];
			}

			else if (arr[i]<sSmall)
				sSmall = arr[i];
		}
		
		return sSmall;
	}

	

public int secondSmallest_2() {
	
	if(arr.length<2)
		return -1;
	
	int fSmall = Integer.MAX_VALUE;
	int sSmall = Integer.MAX_VALUE;
	
	for (int i = 0; i<arr.length;i++) {
		
		if(arr[i] < fSmall) {
			fSmall = arr[i];
		}

		else if (arr[i]>fSmall && arr[i]<sSmall)
			sSmall = arr[i];
	}
	
	return sSmall;
}




	
}
