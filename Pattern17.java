//Pattern 17
/*
 *Input:
 		5
 	Output:
		A 
		B A 
		C B A 
		D C B A 
		E D C B A 
 */
package Pattern;
import java.util.*;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}

	}

}
