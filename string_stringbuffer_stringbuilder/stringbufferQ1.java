// Write an application to append the following strings “StringBuffer”, “is a peer class of 
// String”, “that provides much of “, “the functionality of strings” using a StringBuffer.



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
