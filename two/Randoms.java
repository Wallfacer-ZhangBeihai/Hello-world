/**
 * Randoms��ʵ�ֹ��ܣ�1�����������Զ�����10��100���ڵ�2��������������������ʽ��+ - *  /����Ҫ��������Ҳ��100����
 * ��Randoms���ж�����������Ա����a��b
 * ��ranDoms�����е��ù����ࡪ��Factory�е�factory����ʵ�ֹ��ܣ�1��
 */
package cn.deu.ccut.two;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.math.BigInteger;
public class Randoms {
	
		static double number=100;
		static double b=10;
		static int t=0;
		static int r=4;
		static Random rand =new Random();
			
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("d:/result.txt");
			Scanner sc=new Scanner(System.in);
			Fuhao fu=new Fuhao();
			Chengchu che=new Chengchu();
			
			ranDoms();
				
					t= (int) fu.fuhao();	
					r=(int) che.chengchu();
					if(r!=1) {
						r=2;
					}else {
						r=4;
					}
					 Shut shu=new Shut();
					 number = shu.shut();
					 Down dow=new Down();
					 b=dow.down();
					 System.setOut(ps);
					 ranDoms();
					
		}
	public static void ranDoms(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b;i++){
		double a= rand.nextInt((int)number);
		double b= rand.nextInt((int)number);
		if(t==1) {
			a=((rand.nextInt(2))==1?-1:1)*a;
			b=((rand.nextInt(2))==1?-1:1)*b;
		 }
		Factory fac=new Factory();
		fac.factory(number,a,b);
		}
	}
	
	
		
	
}

