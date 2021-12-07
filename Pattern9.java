//Pattern9
/*
 * Output:
 		  P 
	     R O 
	    G R A 
	   M P R O 
	  G R A M P 
	 R O G R A M 
 */
package Pattern;
import java.util.*;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="PROGRAM";
		int n=s.length();
		int st=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print(s.charAt(st)+" ");
				st++;
				if(st==n) {
					st=0;
				}
				
			}
			System.out.println();
		}

	}

}
