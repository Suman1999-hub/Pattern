//Pattern4
/*
 * Input:
 		5
 	Output:
		   *
		  ***
		 *****
		*******
 */
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int l=1;
		for(int i=1;i<row;i++) {
			for(int j=1;j<row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
