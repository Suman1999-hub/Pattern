//Pattern8
/*
 * Input:
 		5
   Output:
 	
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2 
		1 

 */
package Pattern;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			int x=1;
			for(int k=1;k<=i;k++) {
				System.out.print(x+" ");
				x++;
			}
			
			
			System.out.println();
		}
		for(int i=1;i<row;i++) {
			int x=1;
			for(int k=1;k<=row-i;k++) {
				System.out.print(x+" ");
				x++;
			}
			
			
			System.out.println();
		}
		

	}

}
