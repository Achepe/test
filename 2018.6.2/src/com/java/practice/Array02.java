package com.java.practice;
/*
 * 	 案例演示
 *  	数组获取最值(获取数组中的最大值最小值)
 */
public class Array02 {

	public static void main(String[] args) {
		int[] arr = {44,66,11,22,88,77};
		int max =getMax(arr);
		System.out.println(max);
	}
	
	//调用一个方法获取最大值
	//返回值int类型、参数int[] arr
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}
