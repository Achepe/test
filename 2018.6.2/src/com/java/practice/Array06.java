package com.java.practice;
/*
 * 二维数组的遍历
 */
public class Array06 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,4},{5,9},{7,9,10,55,66}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
