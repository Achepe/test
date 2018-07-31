package com.java.practice;

import java.util.Scanner;

/*
 * 案例演示
	* 数组查表法(根据键盘录入索引,查找对应星期)
 */
public class Array04 {

	public static void main(String[] args) {
		/*char[] arr = {'一','二','三','四','五','六','日'};
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入索引");
		int team = s1.nextInt();
		s1.close();
		System.out.println(arr[team-1]);*/
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入对应的星期，范围在1-7");
		int week = s1.nextInt();
		System.out.println("星期" + getWeek(week));
		s1.close();
		
	}
	/*
	 * 根据索引返回对应的星期
	 * 1、返回值类型char
	 * 2、参数列表 int week！！！
	 */
	public static char getWeek(int week){
		char[] arr = {' ','一','二','三','四','五','六','日'};
		return arr[week];
	}
}
