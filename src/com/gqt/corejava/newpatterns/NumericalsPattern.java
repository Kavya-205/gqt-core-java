/**
 * 
 */
package com.gqt.corejava.newpatterns;
import java.util.Scanner;

/**
 *     #
 *   # #
 * #   #
 *     #
 * # # # # #
 */
/**
 * @author kavya
 * @category pattern
 * @description this is an example for an universal patterns
 */
public class NumericalsPattern {
   
	/**
	 * @param args
	 * @description this is the source code of numerical patterns
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==(n/2) ||i==(n-1) ||j+i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
/**
 * # # # # #
 *         #
 * # # # # #
 * #        
 * # # # # #
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||i==(n/2) ||j==0&&i>=(n/2) ||j==(n-1)&&i<=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
/**
 * # # # # #
 *         #
 * # # # # #        
 *         #
 * # # # # #
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||j==(n-1) ||i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
/**
 * #   #
 * #   #
 * # # # # #
 *     #
 *     #
 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) ||i==(n/2) ||j==0&&i<=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
/**
 * # # # # #
 * #
 * # # # # # 
 *         #
 * # # # # #
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||i==(n/2) ||j==0&&i<=(n/2) ||j==(n-1)&&i>=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
/**
 * # # # # #
 * # 
 * # # # # #
 * #       #
 * # # # # #
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||i==(n/2) ||j==0 ||j==(n-1)&&i>=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
/**
 * # # # 
 *     #
 * # # # # # 
 *     #
 *     #			
 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) ||i==(n/2) ||i==0&&j<=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
/**
 * # # # # #
 * #       #
 * # # # # #      
 * #       #
 * # # # # # 	   
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||i==n-1 ||j==0 ||j==n-1 ||i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
/**
 * # # # # #
 * #       #
 * # # # # #      
 *         #
 * # # # # #			
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||i==(n/2) ||j==(n-1) ||j==0&&i<=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
/**
 * # # # # #
 * #       #
 * #       #
 * #       #
 * # # # # #	  
 */
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) ||j==0 ||j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		

	}

}
