/* Create abstract class vaccine.Create two variables age(int),nationality(String).create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose. Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods accordingly. [Hint:Create constructor to initialize variables age and nationality,Use flow control(Ifelse) to check condition]
*/

// logic :


// Abstract class Vaccine
abstract class Vaccine {
    int age;
    String nationality;

    // Constructor to initialize variables
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose taken successfully. Please pay Rs. 250.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for second dose
    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose taken successfully.");
        } else {
            System.out.println("You are not eligible for the second dose. Please take the first dose first.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose();
}

// Implementation class vaccinationSuccessful
class VaccinationSuccessful extends Vaccine {
    // Constructor to initialize variables
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implementing the abstract method boosterDose
    @Override
    public void boosterDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("Booster dose taken successfully.");
        } else {
            System.out.println("You are not eligible for the booster dose.");
        }
    }
}

// Main class Vaccination
public class Vaccination {
    public static void main(String[] args) {
        // Create an object of the implementation class
        VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");

        // Invoke first dose
        user.firstDose();

        // Simulate first dose completion
        boolean isFirstDoseCompleted = true;

        // Invoke second dose
        user.secondDose(isFirstDoseCompleted);

        // Invoke booster dose
        user.boosterDose();
    }
}

/*  output:

First dose taken successfully. Please pay Rs. 250.
Second dose taken successfully.
Booster dose taken successfully.


*/