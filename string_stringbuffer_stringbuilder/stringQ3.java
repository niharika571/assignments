//Given a String “Java String pool refers to collection of Strings which are stored in heap
//        memory”, perform the following operations (Hint: all operation can be performed using
//        String methods)
//        a. Print the string to console in lowercase
//        b. Print the string to console in uppercase
//        c. Replace all ‘a’ character in the string with $ sign
//        d. Check if the original String contains the word “collection”
//        e. Check if the following String “java string pool refers to collection of strings which
//        are stored in heap memory” matches the original
//        f. If the string does not match check if there is another method which can be used to
//        check if the strings are equal




public class StringQ3 {
    public static void main(String[] args) {
        String originalString = "Java String pool refers to collection of Strings which are stored in heap memory";
        String comparisonString = "java string pool refers to collection of strings which are stored in heap memory";

        // Print the string in lowercase
        System.out.println("Lowercase: " + originalString.toLowerCase());

        // Print the string in uppercase
        System.out.println("Uppercase: " + originalString.toUpperCase());

        // Replace 'a' characters with '$' sign
        String replacedString = originalString.replace('a', '$');
        System.out.println("Replaced: " + replacedString);

        // Check if the original string contains the word "collection"
        boolean containsWord = originalString.contains("collection");
        System.out.println("Contains 'collection': " + containsWord);

        // Check if the comparison string matches the original string
        boolean matches = originalString.equalsIgnoreCase(comparisonString);
        System.out.println("Matches (ignoring case): " + matches);

        // Check if the strings are equal using the equals() method
        boolean equals = originalString.equals(comparisonString);
        System.out.println("Equals: " + equals);
    }
}
