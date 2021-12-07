//Pattern5
/* 
 * Input:
 *		5
 * Output:
	    * * * * * 
		* * * * 
		* * * 
		* * 
		*  
 */
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
