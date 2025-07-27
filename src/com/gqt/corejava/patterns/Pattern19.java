package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		int k=1;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(k +"  ");
				k++;
			}
			System.out.println();
		}

	}

}
