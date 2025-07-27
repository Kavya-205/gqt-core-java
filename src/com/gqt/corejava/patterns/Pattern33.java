package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a=2*i;
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=a;j>=0;j--) {
				System.out.print((char) ('A'+j));
			}
			
			System.out.println();
		}

	}

}
