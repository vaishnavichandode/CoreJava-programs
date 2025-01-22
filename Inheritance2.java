// 2. Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods. 

// logic:



// Parent class
class Vehicle {
    // Attributes
    String brand =" Tata ";
    String model="Nexon";
    int year= 2025;

      // Method
       void drive() {
        System.out.println("The " + brand + " " + model + " (" + year + ") is driving.");
    }
}

// Child class
class Car extends Vehicle {
    // Additional attribute
    String color="Blue ";

    // Additional method
     void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " is honking: Beep! Beep!");
    }
}

public class Inheritance2 {
   public static void main(String[] args) {
     Car c=new Car();
     c.drive();
     c.honk();
   } 
}


/* output :

The  Tata  Nexon (2025) is driving.
The Blue   Tata  Nexon is honking: Beep! Beep!




*/
