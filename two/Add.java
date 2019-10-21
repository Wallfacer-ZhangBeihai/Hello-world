/**
 * Add类为Randoms类的子类
 * 该类中进行加法运算
 */
package cn.deu.ccut.two;

public class Add  {
	public void add(double number,double a,double b) {
		int c;
		int d;
		char opera[]= {' ','(',')'};//Opera[0]~Opera[2]依次输出“ （空格）”，“（”，“）”
			if(a>=0) {
				c=0;
			}else {
				c=1;
			}
			
			if(b>=0) {
				d=0;
			}else {
				d=1;
			}
		
		if(a+b<=number) {
			System.out.println(opera[c]+a+opera[c*2]+"+"+opera[d]+b+opera[d*2]+"=");
			
			}else {
				a=(int)a/2;
				b=(int)b/2;
				System.out.println(opera[c]+a+opera[c*2]+"+"+opera[d]+b+opera[d*2]+"=");
			}
	}
}
