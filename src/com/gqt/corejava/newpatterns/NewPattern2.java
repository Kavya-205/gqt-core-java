/**
 * 
 */
package com.gqt.corejava.newpatterns;
import java.util.Scanner;

/**
 * # 
 * # #
 * # - #
 * # - - #
 * # # # # #
 */

/**
 * @author KAVYA
 * @category patterns
 * @description this is an example for conditional patterns
 */
public class NewPattern2 {

	/**
	 * @param args
	 * @description this is source of pattern programs
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 ||i==n ||j==1 || j==i) {
					System.out.print("# ");
				}
				else
				{
					System.out.print("- ");
				}
				
			}
			System.out.println();
		}
		

	}

}
