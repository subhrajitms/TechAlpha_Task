package org.jsp.techalpha;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesElements {
	public static void main(String[] args) {
	  Scanner ip=new Scanner(System.in);
	  System.out.println("Enter Size of an Array..");
	  int size=ip.nextInt();
	  //create An Array
	  int[] arr=new int[size];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=ip.nextInt();
	  }
	  //Take  HashSet to Remove the Duplicates
	  Set<Integer> removeElement=new HashSet<Integer>();
	  for(int i=0;i<arr.length;i++)
	  {
		  removeElement.add(arr[i]);
	  }
	  
	  System.out.println("Original Array:"+Arrays.toString(arr));
	  System.out.println("After the Remove Duplicates:"+removeElement);
	}
}
