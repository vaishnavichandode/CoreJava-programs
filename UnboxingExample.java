// 2. Write a java program for  Unboxing.(all types).

// logic :


public class UnboxingExample {

    // main method
    public static void main(String[] args) {

        // unboxing for Integer (Integer to int)
        Integer integerWrapper = 100;  // Wrapper Integer object
        // unboxing: The Integer object is automatically converted to primitive int
        int intValue = integerWrapper; 
        System.out.println("Unboxing of Integer to int: " + intValue);  // Output int value

        // unboxing for Double (Double to double)
        Double doubleWrapper = 50.75;  // Wrapper Double object
        // unboxing: The Double object is automatically converted to primitive double
        double doubleValue = doubleWrapper; 
        System.out.println("Unboxing of Double to double: " + doubleValue);  // Output double value

        //unboxing for Character (Character to char)
        Character characterWrapper = 'V';  // Wrapper Character object
        // unboxing: The Character object is automatically converted to primitive char
        char charValue = characterWrapper; 
        System.out.println("Unboxing of Character to char: " + charValue);  // Output char value

        // unboxing for Long (Long to long)
        Long longWrapper = 100000L;  // Wrapper Long object
        // Unboxing: The Long object is automatically converted to primitive long
        long longValue = longWrapper; 
        System.out.println("Unboxing of Long to long: " + longValue);  // Output long value

        // unboxing for Float (Float to float)
        Float floatWrapper = 25.5f;  // Wrapper Float object
        // unboxing: The Float object is automatically converted to primitive float
        float floatValue = floatWrapper; 
        System.out.println("Unboxing of Float to float: " + floatValue);  // Output float value

        // unboxing for Byte (Byte to byte)
        Byte byteWrapper = 10;  // Wrapper Byte object
        // unboxing: The Byte object is automatically converted to primitive byte
        byte byteValue = byteWrapper; 
        System.out.println("Unboxing of Byte to byte: " + byteValue);  // Output byte value

        //unboxing for Short (Short to short)
        Short shortWrapper = 300;  // Wrapper Short object
        // unboxing: The Short object is automatically converted to primitive short
        short shortValue = shortWrapper; 
        System.out.println("Unboxing of Short to short: " + shortValue);  // Output short value

        //unboxing for Boolean (Boolean to boolean)
        Boolean booleanWrapper = true;  // Wrapper Boolean object
        // unboxing: The Boolean object is automatically converted to primitive boolean
        boolean booleanValue = booleanWrapper; 
        System.out.println("Unboxing of Boolean to boolean: " + booleanValue);  // Output boolean value
    }
}

/*Output:

Unboxing of Integer to int: 100
Unboxing of Double to double: 50.75
Unboxing of Character to char: V
Unboxing of Long to long: 100000
Unboxing of Float to float: 25.5
Unboxing of Byte to byte: 10
Unboxing of Short to short: 300
Unboxing of Boolean to boolean: true

*/
