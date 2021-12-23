package Pattern;
import java.util.*;
public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		System.out.print(a+" ");
		for(int i=2;i<=n;i++) {
			
			if(i%2==0) {
				a+=7;
				System.out.print(a+" ");
			}
			else {
				a+=1;
				System.out.print(a+" ");
			}
			
		}
		System.out.println();
		a=2;
		System.out.print(a+" ");
		for(int i=2;i<=n;i++) {
			
			if(i%2==0) {
				a+=5;
				System.out.print(a+" ");
			}
			else {
				a+=3;
				System.out.print(a+" ");
			}
			
		}
		System.out.println();
		a=3;
		System.out.print(a+" ");
		for(int i=2;i<=n;i++) {
			
			if(i%2==0) {
				a+=3;
				System.out.print(a+" ");
			}
			else {
				a+=5;
				System.out.print(a+" ");
			}
			
		}
		System.out.println();
		a=4;
		System.out.print(a+" ");
		for(int i=2;i<=n;i++) {
			
			if(i%2==0) {
				a+=1;
				System.out.print(a+" ");
			}
			else {
				a+=7;
				System.out.print(a+" ");
			}
			
		}
	}

}
