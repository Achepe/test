package com.java.practice;
/*
 * 	 ������ʾ
 *  	�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
 */
public class Array02 {

	public static void main(String[] args) {
		int[] arr = {44,66,11,22,88,77};
		int max =getMax(arr);
		System.out.println(max);
	}
	
	//����һ��������ȡ���ֵ
	//����ֵint���͡�����int[] arr
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
