//Series 2
/*
 * Input:
 		8
   Output:
		1 8 27 64 125 216 343 512 
 */
package Pattern;
import java.util.*;
public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum= (int) Math.pow(i,3);
			System.out.print(sum+" ");
					
		}

	}

}
