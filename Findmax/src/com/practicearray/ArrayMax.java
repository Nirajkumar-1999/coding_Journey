package com.practicearray;

public class ArrayMax {
	
	static int []arr = {10,40,20,30};
	static int sum = 0;
	static int max =arr[0];
	static int avg = 0;
	static int count=0;
	
	static void findingSum(int []arr) {
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
	
	static void func(int x) {
		x = x + 5;
		System.out.println(x);
	}
	
	static int findingMax() {
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
//		System.out.println(max);
		return max;
	}
	
	static void findingAvg() {
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println(avg);
	}
	
//	static void countDistinct() {
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i]!=arr[i+1]) {
//				count = count + 1;
//			}
//		}
//		
//		System.out.println(count);
//		
//	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(findingSum());
		
//		findingSum(arr);
//		
//		
//		
//		int x = 5;
//		func(x);
//		System.out.println(x);
		
		findingMax();
		System.out.println(findingMax());
		
		findingAvg();
		
		System.out.println(sum);
		
//		countDistinct();
//	
		

	}

}
