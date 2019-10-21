/**
 * Down类是Primary的子类
 * 该类控制题目数量
 */
package cn.deu.ccut.two;
import java.io.*;
import java.util.*;
public class Down {
	
	public double down() {
		double b = 0;//运算式的个数
		Scanner sc=new Scanner(System.in);
		try {	
				System.out.print("请输入题目的数量：");
				b=sc.nextDouble();// 控制题目的数量
				
			} catch (Exception e) {
				System.out.println("请输入正确的取值范围");
				down();
			}
		return b;
	}
}
