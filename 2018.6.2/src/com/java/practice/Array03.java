package com.java.practice;
/*
 * 	������ʾ
 * 		����Ԫ�ط�ת(���ǰ�Ԫ�ضԵ�)
 */
public class Array03 {

	public static void main(String[] args) {
		int[] arr = {22,66,44,88,11,55};
		reverseArray(arr);	//���÷�����ʹԪ�ط�ת
		print(arr);		//���÷�������ӡ������
	}
	
	public static void reverseArray(int[] arrs){
		for (int i = 0; i < arrs.length / 2; i++) {
			int temp = arrs[i];
			arrs[i] = arrs[arrs.length - 1 - i];
			arrs[arrs.length - 1 - i] = temp;
		}
	}
	
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
