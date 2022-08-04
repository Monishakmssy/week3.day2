package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("second largest"+ data[data.length-2]);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
	}
	}
}