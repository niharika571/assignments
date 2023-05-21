//Reverse the following string “This method returns the reversed object on which it was
//        called” using StringBuffer Class


public class StringBufferQ1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("StringBuffer");
        stringBuffer.append(" is a peer class of String");
        stringBuffer.append(" that provides much of");
        stringBuffer.append(" the functionality of strings");

        String result = stringBuffer.toString();
        System.out.println("Result: " + result);
    }
}
