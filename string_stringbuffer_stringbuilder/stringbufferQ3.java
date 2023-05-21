//Reverse the following string “This method returns the reversed object on which it was
//        called” using StringBuffer Class

public class StringBufferQ3 {
    public static void main(String[] args) {
        String originalString = "This method returns the reversed object on which it was called";

        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.reverse();

        String reversedString = stringBuffer.toString();

        System.out.println("Reversed String: " + reversedString);
    }
}
