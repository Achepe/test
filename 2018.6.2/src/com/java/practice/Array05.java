package com.java.practice;
/*
 * ������ʾ
	* ����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 */
public class Array05 {

	public static void main(String[] args) {
		int[] arr = {55,22,66,44,77,23,22,11};
		System.out.println("��" + getIndex(arr, 66) + "��Ԫ��");
	}

	/*
	 * һ�����������ķ���
	 * 1������ֵint����
	 * 2�������б�int[] arr ��int value
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
