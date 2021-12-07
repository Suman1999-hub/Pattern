//Pattern 16
/*
 *Input:
 		5
  Output:
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 

 */
package Pattern;
import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			int ch=65;
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}

	}

}
