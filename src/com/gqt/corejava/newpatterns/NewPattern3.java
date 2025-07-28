/**
 * 
 */
package com.gqt.corejava.newpatterns;
import java.util.Scanner;

/**
 * - - - - - $
 * - - - - $ $ $
 * - - - $ $ $ $ $
 * - - $ $ $ $ $ $ $
 * - $ $ $ $ $ $ $ $ $ 
 */

/**
 * @author kavya
 * @category patterns
 * @description this is an example for pyramid patterns
 */
public class NewPattern3 {

	/**
	 * @param args
	 * @description this is source of pattern programs
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				
					System.out.print("- ");
				}
			for(int j=1;j<=2*i-1;j++) {
					System.out.print("$ ");
				}
			System.out.println();
			}
			
		}
		

	}


