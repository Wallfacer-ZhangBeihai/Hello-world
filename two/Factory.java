/**
 * FactoryΪ�����࣬��Randoms������
 * ����switch���������㷨���ѡ��
 * switch��0��Ϊ�ӷ��� switch��1��Ϊ������ switch��2��Ϊ�˷��� switch��3��Ϊ������
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
