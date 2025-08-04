package lab2_2_d10;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		System.out.println("Give the value of n : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("read "+n+" elements into array : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		int p=0;
		for(int i=0;i<n;i++) {
			for(int j=2;j<(a[i]);j++)
			{
				if(a[i]<=1)
					p=0;
				else if(a[i]%j==0)
					p=0;
				else
					p=1;
				break;
		}
			if(p==1)
				System.out.println(a[i]);
			}}}