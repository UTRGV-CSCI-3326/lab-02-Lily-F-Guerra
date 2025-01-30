public class MixMatch {
    public static void main(String[] args){
        String myString = "petrichor";
        char myChar = 'L';
        short myShort = 2;
        int myInt = 110;
        long myLong = 233223;
        float myFloat = 303;
        double myDouble = 123.0456789;
        boolean myBool = false;

        System.out.println(myString + " <- a string, which stores a sequence or array of characters.");
        System.out.println(myChar + " <- a char, which can hold any single Unicode character.");
        System.out.println(myShort + " <- a short, which has a min of -32,768 and a max of 32,767.");
        System.out.println(myInt + " <- an int, which stores a 32-bit signed integer.");
        System.out.println(myLong + " <- a long, which stores a 64-bit signed integer.");
        System.out.println(myFloat + " <- a float (not the root beer kind), which is a single-precision, 32-bit floating-point number.");
        System.out.println(myDouble + " <- a double, which is a double-precision, 64-bit floating-point number.");
        System.out.println(myBool + " <- a boolean, which stores either 0 or 1, representing false or true respectively.");

        System.out.println("I have " + myShort + " cats and my favorite number is " + myInt);
        System.out.println("Player ID: " + myString + "   High Score: " + myLong);
    }
}