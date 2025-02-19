//1. Write a program using Vector to store the list of students details and print the details.


// logic :

import java.util.Vector;

class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class VectorExample {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<>();

        // Adding students to the Vector
        students.add(new Student(101, "Alice", 20, "CSE"));
        students.add(new Student(102, "Bob", 21, "AIDS"));
        students.add(new Student(103, "Charlie", 22, "ENTC"));

        // Displaying student details
        System.out.println("Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}


/*

output:

Student Details:
ID: 101, Name: Alice, Age: 20, Department: CSE
ID: 102, Name: Bob, Age: 21, Department: AIDS
ID: 103, Name: Charlie, Age: 22, Department: ENTC





*/
