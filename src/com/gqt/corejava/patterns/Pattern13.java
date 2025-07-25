package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=1;j<=n;j++) {
				System.out.print(k+"  ");
				k=k+n;
			}
			System.out.println();
			
		    
		}
		
	}

}
