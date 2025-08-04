package lab3_d10;
import java.util.*;
public class Student {
	   String sname;
	    int[] marks_array;
	    int total;
	    double avg;

	    // Method to assign initial values to the STUDENT object
	    void assign(String name, int[] marks) {
	        sname = name;
	        marks_array = marks;
	        compute();
	    }

	    // Method to compute total and average marks
	    void compute() {
	        total = 0;
	        for (int mark : marks_array) {
	            total += mark;
	        }
	        avg = (double) total / marks_array.length;
	    }

	    // Method to display the STUDENT object
	    void display() {
	        System.out.println("Student Name: " + sname);
	        System.out.print("Marks: ");
	        for (int mark : marks_array) {
	            System.out.print(mark + " ");
	        }
	        System.out.println("\nTotal Marks: " + total);
	        System.out.println("Average Marks: " + avg);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student student = new Student();
	        int[] marks = {85, 90, 81, 92, 88}; // Example marks
	        student.assign("Joe", marks);
	        student.display();
	}

}



o/p:
Student Name: Joe
Marks: 85 90 81 92 88 
Total Marks: 436
Average Marks: 87.2
