
public class Student_1 {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    // Default constructor
    Student_1() {
        sname = "Unknown";
        marks_array = new int[5]; // Assuming 5 subjects
        total = 0;
        avg = 0.0;
    }

    // Parameterized constructor
    Student_1(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        compute(); // Compute total and average marks
    }

    // Method to assign initial values to the STUDENT object
    void assign(String name, int[] marks) {
        sname = name;
        marks_array = marks;
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
        // Using default constructor
        Student_1 student1 = new Student_1();
        student1.display();

        // Using parameterized constructor
        int[] marks = {85, 90, 78, 92, 88};
        Student_1 student2 = new Student_1("John Doe", marks);
        student2.display();
    }
}
