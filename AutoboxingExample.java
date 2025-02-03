//1. Write  a java program for Autoboxing.(All Primitive Types)


// logic :

public class AutoboxingExample {

    public static void main(String[] args) {
        
        // autoboxing for int (Primitive to Integer)
        int intVar = 10;
        // autoboxing: The primitive int is converted to an Integer object
        Integer intWrapper = intVar;
        System.out.println("Autoboxing of int: " + intWrapper);

        // autoboxing for double (Primitive to Double)
        double doubleVar = 60.75;
        // autoboxing: The primitive double is converted to a Double object
        Double doubleWrapper = doubleVar;
        System.out.println("Autoboxing of double: " + doubleWrapper);

        // 3. autoboxing for char (Primitive to Character)
        char charVar = 'V';
        // Autoboxing: The primitive char is converted to a Character object
        Character charWrapper = charVar;
        System.out.println("Autoboxing of char: " + charWrapper);

        // 4. Autoboxing for long (Primitive to Long)
        long longVar = 100000L;
        // Autoboxing: The primitive long is automatically converted to a Long object
        Long longWrapper = longVar;
        System.out.println("Autoboxing of long: " + longWrapper);

        // 5. Autoboxing for float (Primitive to Float)
        float floatVar = 20.5f;
        // Autoboxing: The primitive float is automatically converted to a Float object
        Float floatWrapper = floatVar;
        System.out.println("Autoboxing of float: " + floatWrapper);

        // 6. Autoboxing for byte (Primitive to Byte)
        byte byteVar = 10;
        // Autoboxing: The primitive byte is automatically converted to a Byte object
        Byte byteWrapper = byteVar;
        System.out.println("Autoboxing of byte: " + byteWrapper);

        // 7. Autoboxing for short (Primitive to Short)
        short shortVar = 300;
        // Autoboxing: The primitive short is automatically converted to a Short object
        Short shortWrapper = shortVar;
        System.out.println("Autoboxing of short: " + shortWrapper);

        // 8. autoboxing for boolean (Primitive to Boolean)
        boolean booleanVar = true;
        // autoboxing: The primitive boolean is converted to a Boolean object
        Boolean booleanWrapper = booleanVar;
        System.out.println("Autoboxing of boolean: " + booleanWrapper);
    }
}



/*   Output:

Autoboxing of int: 10
Autoboxing of double: 60.75
Autoboxing of char: V
Autoboxing of long: 100000
Autoboxing of float: 20.5
Autoboxing of byte: 10
Autoboxing of short: 300
Autoboxing of boolean: true


*/