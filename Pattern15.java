//Pattern 15
/*
* Input:
		5
 Output:
		1 
		0 0 
		1 1 1 
		0 0 0 0 
		1 1 1 1 1 
*/
package Pattern;
import java.util.*;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int pos=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				pos++;
				
			}
			System.out.println();
		}


	}

}

