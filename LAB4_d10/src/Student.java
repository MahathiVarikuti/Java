
class Student{
int id;
String name;
Student(){ // zero argument constructor
System.out.println("inside default constructor");
System.out.println("the default values are "+id+" "+name);
}
Student(int i,String n){ // Parameterized constructor
id = i;
name = n;
System.out.println("inside parameterized constructor");
System.out.println("the values are "+id+" "+name);
}
public static void main(String args[]){
Student s1 = new Student(); //calling default constructor
Student s2 = new Student(102,"Nate"); //calling parameterized constructor
}
}