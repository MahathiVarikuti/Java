package lab2_2_d10;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		System.out.println("Give the value of n : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			}
		System.out.println("the elements of array :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);}
	}

}
