/**
 * Shut����Primary�������
 * ��������������Ŀ��ֵ��ȡֵ��Χ
 */

package cn.deu.ccut.two;


import java.io.*;
import java.util.*;

public class Shut {
		
	static double shut() {
		Scanner sc=new Scanner(System.in);
		 double a=0;//��������ȡֵ��Χ
		
		try {	
				System.out.print("������������ķ�Χ��");
				a=sc.nextDouble();// ������Ŀ��ֵ��ȡֵ��Χ
				
			} catch (Exception e) {
				System.out.println("��������ȷ��ȡֵ��Χ");
				shut();
			}
		return a;
	}
}
