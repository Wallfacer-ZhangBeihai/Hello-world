package cn.deu.ccut.two;

import java.util.Scanner;

public class Chengchu {
	int a;
	public double chengchu() {
	Scanner sc=new Scanner(System.in);
	try {	
		System.out.print("�Ƿ�����˳����㣬�ǰ�1�����������֣�");
		 a=sc.nextInt();
		
	} catch (Exception e) {
		System.out.println("��������ȷ��ȡֵ��Χ");
		chengchu();
		}
	
	return a;
	}
}
