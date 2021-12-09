//Fexle Company
/*
 * Output:
 		K 
		K N 
		K N O 
		K N O W 
		N O W 
		O W 
		W 

 */
package Pattern;
import java.util.*;
public class Fexle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str="KNOW";
		int n=str.length();
		for(int i=0;i< n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			int c=i;
			for(int j=1;j<=n-i;j++) {
				System.out.print(str.charAt(c)+" ");
				c++;
			}
			System.out.println();
		}

	}

}
