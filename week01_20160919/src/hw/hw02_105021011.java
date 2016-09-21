package hw;
/*
 *Topic:請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 *Date: 2016/09/21
 *Author: 105021011 丁紹剛
 */
import java.util.Random;
import java.util.Scanner;
public class hw02_105021011 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scn = new Scanner(System.in);
	    int n = scn . nextInt( ) ; 
		
		int a = rnd.nextInt(100)+1;
		System.out.println(a);
		int b = rnd.nextInt(100)+1;
		System.out.println(b);
		int c = rnd.nextInt(100)+1;
		System.out.println(c);
		int d = rnd.nextInt(100)+1;
		System.out.println(d);
		int e = rnd.nextInt(100)+1;
		System.out.println(e);
		int f = rnd.nextInt(100)+1;
		System.out.println(f);
		
	}
}
