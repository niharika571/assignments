class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        int passCount = 0;
        
        if (subject1Marks > 60) passCount++;
        if (subject2Marks > 60) passCount++;
        if (subject3Marks > 60) passCount++;
        
        if (passCount == 3) {
            return "Passed";
        } else if (passCount == 2) {
            return "Promoted";
        } else {
            return "Failed";
        }
    }
}

public class Assignment1Q4 {
    public static void main(String[] args) {
        ResultDeclaration resultDeclaration = new ResultDeclaration();
        
        // Test cases
        System.out.println(resultDeclaration.declareResults(10, 10, 10));  // failed
        System.out.println(resultDeclaration.declareResults(70, 10, 10));  // failed
        System.out.println(resultDeclaration.declareResults(10, 20, 40));  // passed
        System.out.println(resultDeclaration.declareResults(10, 30, 40));  // Passed / Promoted
    }
}
