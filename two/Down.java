/**
 * Down����Primary������
 * ���������Ŀ����
 */
package cn.deu.ccut.two;
import java.io.*;
import java.util.*;
public class Down {
	
	public double down() {
		double b = 0;//����ʽ�ĸ���
		Scanner sc=new Scanner(System.in);
		try {	
				System.out.print("��������Ŀ��������");
				b=sc.nextDouble();// ������Ŀ������
				
			} catch (Exception e) {
				System.out.println("��������ȷ��ȡֵ��Χ");
				down();
			}
		return b;
	}
}
