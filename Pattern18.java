//Pattern 18
/*
 * Input:
 		5
   Output:
	     A
	    ABA
	   ABCBA
	  ABCDCBA
	 ABCDEDCBA
 */
package Pattern;
import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print((char)(65+j));
			}
			for(int j=i;j>=0;j--) {
				System.out.print((char)(65+j));
			}
			
			
			System.out.println();
		}
		
	}

}

