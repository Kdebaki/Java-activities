package activity;
public class stringbufferreader {
    public static void main(String[] args) {
        // Example using String class methods
        String str = "Hello, world!";
        
        // length() method of String class
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // charAt() method of String class
        char charAtIndex5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);
        
        // substring() method of String class
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // toUpperCase() method of String class
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);
        
        // Example using StringBuffer class methods
        StringBuffer stringBuffer = new StringBuffer("Hello, world!");
        
        // append() method of StringBuffer class
        stringBuffer.append(" Welcome");
        System.out.println("After appending: " + stringBuffer);
        
        // insert() method of StringBuffer class
        stringBuffer.insert(6, "Awesome ");
        System.out.println("After inserting at index 6: " + stringBuffer);
        
        // delete() method of StringBuffer class
        stringBuffer.delete(7, 15);
        System.out.println("After deleting from index 7 to 14: " + stringBuffer);
        
        // reverse() method of StringBuffer class
        stringBuffer.reverse();
        System.out.println("After reversing: " + stringBuffer);
    }
}
