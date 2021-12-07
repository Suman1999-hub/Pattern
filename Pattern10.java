//Pattern 10
/*
 * Input:
 			5
   Output:
	        1 
	      2 3 2 
	    3 4 5 4 3 
	  4 5 6 7 6 5 4 
	5 6 7 8 9 8 7 6 5 
 */
package Pattern;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			int temp=i;
			for(int j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;	
			}
			temp--;
			for(int j=1;j<i;j++) {
				temp--;
				System.out.print(temp+" ");	
			}
			
			
			System.out.println();
		}
	}

}
