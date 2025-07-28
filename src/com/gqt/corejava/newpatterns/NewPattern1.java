/**
 * 
 */
package com.gqt.corejava.newpatterns;
import java.util.Scanner;

/**
 * # # # # # 
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 */

/**
 * @author kavya
 * @category patterns
 * @description this is an example for conditional patterns
 */
public class NewPattern1 {

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
				if(i==0 || i==(n-1) ||j==0 || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
				
			}
			System.out.println();
		}
		

	}

}
