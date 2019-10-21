package cn.deu.ccut.two;

import java.util.Scanner;

public class Fuhao {
	int a;
	public double fuhao() {
	Scanner sc=new Scanner(System.in);
	try {	
		System.out.print("是否包含负数，是按1，否按其他数字：");
		 a=sc.nextInt();
		
	} catch (Exception e) {
		System.out.println("请输入正确的取值范围");
		fuhao();
		}
	
	return a;
	}
}
