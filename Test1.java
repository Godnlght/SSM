package kgc.com;

//�������������ı�����������ֵ���н���

import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����뽻��ǰ�ĵ�һ������:");
		int num1 = input.nextInt();
		System.out.print("�����뽻��ǰ�ĵڶ�������:");
		int num2 = input.nextInt();
		
		System.out.println("�л�ǰ:"+num1+"\t"+num2);
		//num1Ϊ8��num2Ϊ9,num1=num1+num2
		
		num1=num1+num2;//num1Ϊ17
		num2=num1-num2;//17-8=9
		num1=num1-num2;//17-9=8
		
		System.out.println("***********************");
		System.out.println("�л���:"+num1+"\t"+num2);
	}
}
