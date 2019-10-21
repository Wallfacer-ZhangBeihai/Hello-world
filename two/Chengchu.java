package cn.deu.ccut.two;

import java.util.Scanner;

public class Chengchu {
	int a;
	public double chengchu() {
	Scanner sc=new Scanner(System.in);
	try {	
		System.out.print("是否包含乘除运算，是按1，否按任意数字：");
		 a=sc.nextInt();
		
	} catch (Exception e) {
		System.out.println("请输入正确的取值范围");
		chengchu();
		}
	
	return a;
	}
}
