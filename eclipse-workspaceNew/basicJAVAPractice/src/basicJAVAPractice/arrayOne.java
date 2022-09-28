package basicJAVAPractice;

import java.util.Scanner;

public class arrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n= scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n ; i++) {
			System.out.println("Enter the value of array: ");
			int x = scan.nextInt();
			arr[i] = x;
			
		}
		System.out.println("Total Length of array is: "+ arr.length);

	}

}
