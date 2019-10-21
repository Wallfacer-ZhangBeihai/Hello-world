/**
 * Shut类是Primary类的子类
 * 该类控制输入的题目数值的取值范围
 */

package cn.deu.ccut.two;


import java.io.*;
import java.util.*;

public class Shut {
		
	static double shut() {
		Scanner sc=new Scanner(System.in);
		 double a=0;//运算数的取值范围
		
		try {	
				System.out.print("请输入操作数的范围：");
				a=sc.nextDouble();// 控制题目数值的取值范围
				
			} catch (Exception e) {
				System.out.println("请输入正确的取值范围");
				shut();
			}
		return a;
	}
}
