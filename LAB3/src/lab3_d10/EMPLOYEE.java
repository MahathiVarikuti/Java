package lab3_d10;
import java.util.*;
public class EMPLOYEE {
	    String Ename;
	    int Eid;
	    double Basic;
	    double DA;
	    double Gross_Sal;
	    double Net_Sal;
	    // Method to read employee details
	    void read(Scanner sc) {
	        System.out.print("Enter Employee Name: ");
	        Ename = sc.next();
	        System.out.print("Enter Employee ID: ");
	        Eid = sc.nextInt();
	        System.out.print("Enter Basic Salary: ");
	        Basic = sc.nextDouble();
	        compute_net_sal();
	    }
	    // Method to compute net salary
	    void compute_net_sal() {
	        DA = 0.52 * Basic;
	        Gross_Sal = Basic + DA;
	        double IT = 0.30 * Gross_Sal;
	        Net_Sal = Gross_Sal - IT;
	    }
	    // Method to display employee details
	    void display() {
	        System.out.println("Employee Name: " + Ename);
	        System.out.println("Employee ID: " + Eid);
	        System.out.println("Basic Salary: " + Basic);
	        System.out.println("DA: " + DA);
	        System.out.println("Gross Salary: " + Gross_Sal);
	        System.out.println("Net Salary: " + Net_Sal);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of employees: ");
	        int N = sc.nextInt();
	        EMPLOYEE[] employees = new EMPLOYEE[N];
	        for (int i = 0; i < N; i++) {
	            employees[i] = new EMPLOYEE();
	            employees[i].read(sc); }
	        System.out.println("\nEmployee Details:");
	        for (int i = 0; i < N; i++) {
	            employees[i].display();
	            System.out.println();}
	        sc.close();
	    }
	}



o/p:
Enter number of employees: 2
Enter Employee Name: sam
Enter Employee ID: 12356
Enter Basic Salary: 30000
Enter Employee Name: eli
Enter Employee ID: 12357
Enter Basic Salary: 25000

Employee Details:
Employee Name: sam
Employee ID: 12356
Basic Salary: 30000.0
DA: 15600.0
Gross Salary: 45600.0
Net Salary: 31920.0

Employee Name: eli
Employee ID: 12357
Basic Salary: 25000.0
DA: 13000.0
Gross Salary: 38000.0
Net Salary: 26600.0

