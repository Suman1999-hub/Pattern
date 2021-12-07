//Pattern 2
/*
 * Input:
 		5
   Output:
	        * 
	      * * 
	    * * * 
	  * * * * 
	* * * * * 
 */
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

