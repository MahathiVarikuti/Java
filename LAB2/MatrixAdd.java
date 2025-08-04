package lab2_2_d10;
import java.util.*;
public class MatrixAdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0 ;
		System.out.println("number of rows : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("number of coluns : ");
	    int c = sc.nextInt();
	    System.out.println("1st matrix : ");
		int a1[][]=new int[r][c];
		System.out.println("read "+(r*c)+" elements into 1st array : ");
		for( i=0;i<r;i++) {
			for( j=0;j<c;j++) {
			a1[i][j]=sc.nextInt();
			}
	}
		System.out.println("2nd matrix : ");
		int a2[][]=new int[r][c];
		System.out.println("read "+(r*c)+" elements into 2nd array : ");
		for(i=0;i<r;i++) {
			for( j=0;j<c;j++) {
			a2[i][j]=sc.nextInt();
			}
	}
		int a3[][]= new int[r][c];
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}}
System.out.println("sum of the two matrices is : ");
for(i=0;i<r;i++) {
	for( j=0;j<c;j++) {
		System.out.print(a3[i][j] + "\t");
	}
	System.out.print("\n");}}}
