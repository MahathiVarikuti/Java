package lab2_2_d10;
import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		int n ;
		int i ;
		int temp;
		System.out.println("Give the value of n : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("read "+n+" elements into array : ");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("the elements of array after reversing :");
		for(i=0;i<a.length/2;i++) {
				temp=a[i];
				a[i]=a[a.length-i-1];
				a[a.length-i-1]=temp;}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
			}

	}
}
