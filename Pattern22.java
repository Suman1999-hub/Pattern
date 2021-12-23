// Pattern 22
/*
  Input:
	5
  Output:
      	    *
	   * *
	  *   *
	 *     *
	*********
*/

package Pattern;
import java.util.*;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				if(j==1 || i==n || j==(2*i-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
