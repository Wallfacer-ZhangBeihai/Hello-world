/**
 * Minus类为Randoms的子类
 * 在该类中进行加法运算
 */
package cn.deu.ccut.two;

public class Minus{
	public void minus(double number,double a,double b) {
		int c;
		int d;
		char opera[]= {' ','(',')'};//Opera[0]~Opera[2]依次输出“ （空格）”，“（”，“）”
			if(a<0) {
				c=1;
			}else {
				c=0;
			}
			if(b<0) {
				d=1;
			}else {
				d=0;
			}
		if(a>b) {
			System.out.println(+opera[c]+a+opera[c*2]+"-"+opera[d]+b+opera[d*2]+"=");
		}else {
			System.out.println(+opera[c]+a+opera[c*2]+"-"+opera[d]+b+opera[d*2]+"=");
		}
	}
}
