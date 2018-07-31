package com.java.practice;
/*
 * 案例演示
	* 数组元素查找(查找指定元素第一次在数组中出现的索引)
 */
public class Array05 {

	public static void main(String[] args) {
		int[] arr = {55,22,66,44,77,23,22,11};
		System.out.println("第" + getIndex(arr, 66) + "个元素");
	}

	/*
	 * 一个查找索引的方法
	 * 1、返回值int类型
	 * 2、参数列表int[] arr 、int value
	 */
	public static int getIndex(int[] arr, int value){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
}
