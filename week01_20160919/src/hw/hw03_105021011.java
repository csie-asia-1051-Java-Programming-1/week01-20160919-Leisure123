package hw;
/*
 *Topic:請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 *Date: 2016/09/21
 *Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw03_105021011 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		float g = Math.round(Math.min(a,b));
		float h = Math.round(Math.min(c,d));
		float i = Math.round(Math.min(e,f));
		float j = Math.min(g,h);
		System.out.println(Math.min(i, j));


	}

}
