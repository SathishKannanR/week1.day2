package week2.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
	
		int[] a= {25,19,10,55,254,2,1};
		
		Arrays.sort(a);
		
		System.out.println(a.length);
		
		System.out.println("The sec ond largest Number is:" + a[(a.length-2)]);

	}

}
