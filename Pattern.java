//Pattern 13
/*
 * Input:
 		5
   Output:
		0 
		1 0 
		1 0 1 
		0 1 0 1 
		0 1 0 1 0
 */
package Pattern;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int temp=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(temp%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				temp++;
			}
			System.out.println();
		}

	}

}
