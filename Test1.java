package kgc.com;

//不借助第三方的变量将两个数值进行交换

import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入交换前的第一个整数:");
		int num1 = input.nextInt();
		System.out.print("请输入交换前的第二个整数:");
		int num2 = input.nextInt();
		
		System.out.println("切换前:"+num1+"\t"+num2);
		//num1为8，num2为9,num1=num1+num2
		
		num1=num1+num2;//num1为17
		num2=num1-num2;//17-8=9
		num1=num1-num2;//17-9=8
		
		System.out.println("***********************");
		System.out.println("切换后:"+num1+"\t"+num2);
	}
}
