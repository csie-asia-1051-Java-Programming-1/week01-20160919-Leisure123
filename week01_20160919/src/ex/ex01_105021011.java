package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex01_105021011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int f = scn . nextInt( ) ; 
    System.out.println((f-32)*(5.0/9.0));
	}

}
