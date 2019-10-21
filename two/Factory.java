/**
 * Factory为工厂类，是Randoms的子类
 * 利用switch语句进行运算法则的选择
 * switch（0）为加法； switch（1）为减法； switch（2）为乘法； switch（3）为除法；
 */
package cn.deu.ccut.two;

import java.util.Random;

public class Factory extends Randoms{
	Random rand =new Random();	
	public void factory(double max,double a,double b) {
		int i=0;
			switch(rand.nextInt(r)) {	
				case 0:
					i++;
					Add ad=new Add();
					ad.add(max,a,b);
					break;
				case 1:
					i++;
					Minus mis=new Minus();
					mis.minus(max,a,b);
					break;
				case 2:
					i++;
					Multiply mul=new Multiply();
					mul.multiply(max,a,b);
					break;
				case 3:
					i++;
					Division div=new Division();
					div.division(max,a,b);
					break;
				
		}	
	}
}
