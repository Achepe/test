package com.java.practice;

import java.util.Scanner;

/*
 * ������ʾ
	* ������(���ݼ���¼������,���Ҷ�Ӧ����)
 */
public class Array04 {

	public static void main(String[] args) {
		/*char[] arr = {'һ','��','��','��','��','��','��'};
		Scanner s1 = new Scanner(System.in);
		System.out.println("����������");
		int team = s1.nextInt();
		s1.close();
		System.out.println(arr[team-1]);*/
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("�������Ӧ�����ڣ���Χ��1-7");
		int week = s1.nextInt();
		System.out.println("����" + getWeek(week));
		s1.close();
		
	}
	/*
	 * �����������ض�Ӧ������
	 * 1������ֵ����char
	 * 2�������б� int week������
	 */
	public static char getWeek(int week){
		char[] arr = {' ','һ','��','��','��','��','��','��'};
		return arr[week];
	}
}
