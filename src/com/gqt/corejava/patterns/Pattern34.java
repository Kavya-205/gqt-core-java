package com.gqt.corejava.patterns;
import java.util.Scanner;
class Pattern34 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
            for (int j =n-1; j >= i; j--){
                System.out.print(" ");
            }
            for (int j= i;j>= 0;j--){
                System.out.print(j);
            }
            for (int j= 1;j<= i;j++) {
                System.out.print(j);
            }
            System.out.println();
		}
	}
}