package com.day1617;

import java.lang.reflect.Array;

public class Insertsort {

	

	public static void insertionSort(int array[]) {
		// TODO Auto-generated method stub
		int n= array.length;
		for (int j=1;j<n;j++)
		{
			int key =array[j];
			int i=j-1;
			while ((i>-1)&&(array[i]>key))
			{
				array[i+1] =array[i];
				i--;
			}
			array[i+1]=key;
		}
		

	}
	public static void main(String args[])
	{
		int []arr1 = {9,5,8,14,21,85,22};
		System.out.println("Before Insertion sort");
		for(int i:arr1)
		{
			System.out.println(i+"");
		}
		System.out.println();
		
		insertionSort(arr1);
		System.out.println("After insertion Sort");
		for(int i:arr1)
		{
			System.out.println(i+"");
			
		
		}
	}

}
