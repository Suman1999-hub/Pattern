//Pattern 11
/*
 *Input:
  		5
  Output:
		1 
		2 1 
		3 2 1 
		4 3 2 1 
		5 4 3 2 1 

 */
package Pattern;
import java.util.*;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
