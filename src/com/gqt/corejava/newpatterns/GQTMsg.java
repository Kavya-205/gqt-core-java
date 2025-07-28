/**
 * 
 */
package com.gqt.corejava.newpatterns;
import java.util.Scanner;


/**
 * @author KAVYA
 * @category patterns
 * @description this is an example for  universal pattern
 */
public class GQTMsg {

	/**
	 * @param args
	 * @description this is the source code of GQT message pattern program
	 */
	
	/**
	 * thank
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
		    	 if(i==0 || j==(n/2)) {
		    		 System.out.print("# ");
		    	 }
		    	 else {
		    		 System.out.print("  ");
		    	 }
		     }
		     System.out.print(" ");
		     
		     for(int j=0;j<n;j++) {
		    	 if(j==0 ||j==(n-1) ||i==(n/2)) {
		    		 System.out.print("# ");
		    	 }
		    	 else {
		    		 System.out.print("  ");
		    	 }
		     }
		     System.out.print(" ");
		     
		     for(int j=0;j<n;j++) {
					if(i==0 || i==(n/2) || j==0 || j==(n-1) ) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
					
				}
				System.out.print(" ");
				
				for(int j=0;j<n;j++) {
			    	 if(j==0 || j==(n-1) || i==j ) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(j==0 ||i+j==(n/2) || i-j==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("    ");
			      
			     
	/**
	 * you		     
	 */
			     
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==j&&j<=(n/2) ||i+j==(n-1)&&j>=(n/2) || j==(n/2)&&i>=(n/2) ) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 || i==(n-1) ||j==0 ||j==(n-1)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(j==0 ||j==(n-1) ||i==(n-1)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("	   ");
			     
			     
			     
		/**
		 * sir	     
		 */
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||i==(n/2) ||j==0&&i<=(n/2) ||j==(n-1)&&i>=(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||j==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     

			     for(int j=0;j<n;j++) {
			    	 if(j==0 ||i==0&&j<=(n/2) ||j==(n/2)&&i<=(n/2) ||i==(n/2)&&j<=(n/2) ||i-j==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("   ");
			     
			     
		/**
		 * for	     
		 */
			     
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==(n/2) ||i==0 ||j==0) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("	");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 || i==(n-1) ||j==0 ||j==(n-1)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(j==0 ||i==0&&j<=(n/2) ||j==(n/2)&&i<=(n/2) ||i==(n/2)&&j<=(n/2) ||i-j==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("    ");
			     
			     
		/**
		 * selected	     
		 */
			     
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||i==(n/2) ||j==0&&i<=(n/2) ||j==(n-1)&&i>=(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||j==0 ||i==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(j==0 || i==(n-1)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||j==0 ||i==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	   if(i==0 ||i==(n-1) ||j==0) {
			    		   System.out.print("# ");
			    	   }
			    	   else {
			    		   System.out.print("  ");
			    	   }
			       }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 || j==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||j==0 ||i==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 || i==(n-1) ||j==0 ||j==(n-1)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("	    ");
			     
			     
		/**
		 * me
		 */
			     
			     for(int j=0;j<n;j++) {
			    	 if(j==0 || j==(n-1) ||(i==j &&i<=(n/2) ||i+j==(n-1)&&j>=(n/2))) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print(" ");
			     
			     for(int j=0;j<n;j++) {
			    	 if(i==0 ||i==(n-1) ||j==0 ||i==(n/2)) {
			    		 System.out.print("# ");
			    	 }
			    	 else {
			    		 System.out.print("  ");
			    	 }
			     }
			     System.out.print("     ");
			     
			/**
			 * as     
			 */
			    
			     for(int j=0;j<n;j++) {
						if(i==0 || i==(n/2) || j==0 || j==(n-1) ) {
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
						
					}
					System.out.print(" ");
					
					 for(int j=0;j<n;j++) {
				    	 if(i==0 ||i==(n-1) ||i==(n/2) ||j==0&&i<=(n/2) ||j==(n-1)&&i>=(n/2)) {
				    		 System.out.print("# ");
				    	 }
				    	 else {
				    		 System.out.print("  ");
				    	 }
				     }
				     System.out.print("	   ");
				     
		/**
		 * csr		     
		 */
				     
				       for(int j=0;j<n;j++) {
				    	   if(i==0 ||i==(n-1) ||j==0) {
				    		   System.out.print("# ");
				    	   }
				    	   else {
				    		   System.out.print("  ");
				    	   }
				       }
				     System.out.print(" ");
				     
				     for(int j=0;j<n;j++) {
				    	 if(i==0 ||i==(n-1) ||i==(n/2) ||j==0&&i<=(n/2) ||j==(n-1)&&i>=(n/2)) {
				    		 System.out.print("# ");
				    	 }
				    	 else {
				    		 System.out.print("  ");
				    	 }
				     }
				     System.out.print(" ");
				     
				     for(int j=0;j<n;j++) {
				    	 if(j==0 ||i==0&&j<=(n/2) ||j==(n/2)&&i<=(n/2) ||i==(n/2)&&j<=(n/2) ||i-j==(n/2)) {
				    		 System.out.print("# ");
				    	 }
				    	 else {
				    		 System.out.print("  ");
				    	 }
				     }
				     System.out.print("	  ");
				     
				     
			/**
			 * iam	     
			 */
				     
				     for(int j=0;j<n;j++) {
				    	 if(i==0 ||i==(n-1) ||j==(n/2)) {
				    		 System.out.print("# ");
				    	 }
				    	 else {
				    		 System.out.print("  ");
				    	 }
				     }
				     System.out.print("	");
				     
				     for(int j=0;j<n;j++) {
							if(i==0 || i==(n/2) || j==0 || j==(n-1) ) {
								System.out.print("# ");
							}
							else {
								System.out.print("  ");
							}
							
						}
						System.out.print(" ");
						
						 for(int j=0;j<n;j++) {
					    	 if(j==0 || j==(n-1) ||(i==j &&i<=(n/2) ||i+j==(n-1)&&j>=(n/2))) {
					    		 System.out.print("# ");
					    	 }
					    	 else {
					    		 System.out.print("  ");
					    	 }
					     }
					     System.out.print("	   ");
					     
			/**
			 * very		     
			 */
					 
					     for(int j=0;j<n;j++) {
					    	 if(j==0&&i<=(n/2) ||i-j==(n/2) ||j==(n-1)&&i<=(n/2) ||i+j==(n-1)+(n/2)) {
					    		 System.out.print("# ");
					    	 }
					    	 else {
					    		 System.out.print("  ");
					    	 }
					     }
					     System.out.print(" ");
					     
					     for(int j=0;j<n;j++) {
					    	 if(i==0 ||i==(n-1) ||j==0 ||i==(n/2)) {
					    		 System.out.print("# ");
					    	 }
					    	 else {
					    		 System.out.print("  ");
					    	 }
					     }
					     System.out.print(" ");
					     
					     for(int j=0;j<n;j++) {
					    	 if(j==0 ||i==0&&j<=(n/2) ||j==(n/2)&&i<=(n/2) ||i==(n/2)&&j<=(n/2) ||i-j==(n/2)) {
					    		 System.out.print("# ");
					    	 }
					    	 else {
					    		 System.out.print("  ");
					    	 }
					     }
					     System.out.print("");
					     
					     for(int j=0;j<n;j++) {
					    	 if(i==j&&j<=(n/2) ||i+j==(n-1)&&j>=(n/2) || j==(n/2)&&i>=(n/2) ) {
					    		 System.out.print("# ");
					    	 }
					    	 else {
					    		 System.out.print("  ");
					    	 }
					     }
					     System.out.print("     ");
					      
					     
					/**
					 * happy     
					 */
					    
					     for(int j=0;j<n;j++) {
					    	 if(j==0 ||j==(n-1) ||i==(n/2)) {
					    		 System.out.print("# ");
					    	 }
					    	 else {
					    		 System.out.print("  ");
					    	 }
					     }
					     System.out.print("");
					     
					     for(int j=0;j<n;j++) {
								if(i==0 || i==(n/2) || j==0 || j==(n-1) ) {
									System.out.print("# ");
								}
								else {
									System.out.print("  ");
								}
								
							}
							System.out.print(" ");
							
							 for(int j=0;j<n;j++) {
						    	 if(j==0 ||i==0 ||i==(n/2) ||j==(n-1)&&i<(n/2)) {
						    		 System.out.print("# ");
						    	 }
						    	 else {
						    		 System.out.print("  ");
						    	 }
						     }
						     System.out.print(" ");
						     
						     for(int j=0;j<n;j++) {
						    	 if(j==0 ||i==0 ||i==(n/2) ||j==(n-1)&&i<(n/2)) {
						    		 System.out.print("# ");
						    	 }
						    	 else {
						    		 System.out.print("  ");
						    	 }
						     }
						     System.out.print(" ");
						     
						     for(int j=0;j<n;j++) {
						    	 if(i==j&&j<=(n/2) ||i+j==(n-1)&&j>=(n/2) || j==(n/2)&&i>=(n/2) ) {
						    		 System.out.print("# ");
						    	 }
						    	 else {
						    		 System.out.print("  ");
						    	 }
						     }
						     System.out.println("	  ");
		}
	}
}