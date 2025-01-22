// 1. Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods.

// logic :


// parent class 

class Parent {
    String name ="vaishnavi ";
    int age = 21;

    void  speak(){
        System.out.println(" I am  "+ name +". I am  "+age +" year old " );
    }
}
  
// child class 
 class Student  extends Parent {
    String  grade =  "A";
         
         void study(){
            System.out.println(name +"is studing in grade "+grade);
         }
}


public class Inheritance1  {
    public static void main(String[] args) {
        Student st= new Student();
        st.speak();
        st.study();
 
    }
}


/*  output:

I am  vaishnavi . I am  21 year old 
vaishnavi is studing in grade A


*/