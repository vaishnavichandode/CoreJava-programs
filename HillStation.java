/*  Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
*/

// logic :


// public class HillStation {
    
// }


// Superclass HillStations
class HillStations {
    // Method to print location of the hill station
    public void location() {
        System.out.println("HillStation location");
    }

    // Method to print what the hill station is famous for
    public void famousFor() {
        System.out.println("HillStation is famous for its beauty");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for adventure sports and scenic beauty.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its waterfalls and colonial heritage.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing and its meadows.");
    }
}

// Main class
public class HillStation {
    public static void main(String[] args) {
        // Using the Parent class reference to call the subclass methods (runtime polymorphism)
        HillStations hill;

        // Reference to Manali
        hill = new Manali();
        hill.location();
        hill.famousFor();

        System.out.println();

        // Reference to Mussoorie
        hill = new Mussoorie();
        hill.location();
        hill.famousFor();

        System.out.println();

        // Reference to Gulmarg
        hill = new Gulmarg();
        hill.location();
        hill.famousFor();

        System.out.println();

        // Calling methods directly from each subclass
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        System.out.println();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        System.out.println();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}


/* output:

Manali is located in Himachal Pradesh.
Manali is famous for adventure sports and scenic beauty.

Mussoorie is located in Uttarakhand.
Mussoorie is famous for its waterfalls and colonial heritage.

Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for skiing and its meadows.

Manali is located in Himachal Pradesh.
Manali is famous for adventure sports and scenic beauty.

Mussoorie is located in Uttarakhand.
Mussoorie is famous for its waterfalls and colonial heritage.

Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for skiing and its meadows.





*/
