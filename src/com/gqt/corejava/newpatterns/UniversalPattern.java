/**
 * 
 */
package com.gqt.corejava.newpatterns;
import java.util.Scanner;

/**
 * @author KAVYA
 * @category patterns
 * @description this is an example for universal patterns
 */
public class UniversalPattern {

	/**
	 * @param args
	 * @description this is source of pattern programs
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||j==0 || j==(n-1) || i==(n/2) || j==(n/2) || i==j || i+j==(n-1)
				   || i+j==(n/2) || i-j==(n/2) || j-i==(n/2) || i+j==(n-1)+(n/2)) {
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||j==0 || j==(n-1) || i==(n/2) || j==(n/2) || i==j || i+j==(n-1)
				   || i+j==(n/2) || i-j==(n/2) || j-i==(n/2) || i+j==(n-1)+(n/2)) 
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
		}
		

	
    System.out.println();
		}
	}

}
