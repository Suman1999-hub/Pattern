// Pascal’s Triangle
/*
 * Input:
 		5
   Output:
 		1 
		1 1 
		1 2 1 
		1 3 3 1 
		1 4 6 4 1
 */
package Pattern;
import java.util.*;
public class PascalTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int temp=1;
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(temp+" ");
				temp=temp*(i-j)/j;
				
			}
			System.out.println();
		}
		
		
	}

}
