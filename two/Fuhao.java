package cn.deu.ccut.two;

import java.util.Scanner;

public class Fuhao {
	int a;
	public double fuhao() {
	Scanner sc=new Scanner(System.in);
	try {	
		System.out.print("�Ƿ�����������ǰ�1�����������֣�");
		 a=sc.nextInt();
		
	} catch (Exception e) {
		System.out.println("��������ȷ��ȡֵ��Χ");
		fuhao();
		}
	
	return a;
	}
}
