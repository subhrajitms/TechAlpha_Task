package org.jsp.techalpha;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Size of an Array..");
		int size = ip.nextInt();
		System.out.println("Enter how time you want Rotation..");
		int d = ip.nextInt();
		// Take Array
		int[] arr = new int[size];

		System.out.println("Enter the Array Elements..");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ip.nextInt();
		}
		// To Rotate an Array
		for (int i = 1; i <= d; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("After Rotation....");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}
}
