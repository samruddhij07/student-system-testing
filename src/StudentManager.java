import java.util.*;

public class StudentManager {
    // Existing Logic
    public String calculateGrade(int score) {
        if (score < 0 || score > 100) return "Invalid Score";
        if (score >= 90) return "A";
        if (score >= 75) return "B";
        if (score >= 40) return "C";
        return "F";
    }

    public boolean isPassed(int score) {
        return score >= 40 && score <= 100;
    }

    /**
     * COMPLEX FUNCTION ADDED FOR QUALITY GATE TESTING
     * This contains intentional Bugs, Vulnerabilities, and Debt.
     
    public void processStudentReportCard(String studentName, List<Integer> scores) {
        // 1. VULNERABILITY: Hardcoded sensitive information (Security Rating will drop)
        String dbPassword = "admin_password_2026"; 
        
        // 2. BUG: Potential NullPointerException (Reliability Rating will drop)
        // If 'scores' is null, .size() will crash the program
        System.out.println("Processing " + scores.size() + " scores for " + studentName);

        // 3. TECHNICAL DEBT: Cognitive Complexity (Deeply nested loops/ifs)
        // This is "messy" code that is hard to maintain
        if (studentName != null) {
            for (int i = 0; i < scores.size(); i++) {
                if (scores.get(i) > 0) {
                    for (int j = 0; j < 1; j++) { // Useless loop adding complexity
                        if (scores.get(i) > 90) {
                            System.out.println("Excellent score detected!");
                        }
                    }
                }
            }
        }

        // 4. BUG: Arithmetic Exception risk
        // If scores list is empty, this divides by zero
        int average = 0;
        try {
            int total = 0;
            for(int s : scores) { total += s; }
            average = total / scores.size(); 
        } catch (Exception e) {
            // 5. TECHNICAL DEBT: Empty catch block (Major Code Smell)
            // SonarQube hates this because it hides errors
        }

        // 6. BUG: Dead Code / Unused Variable
        // This variable is created but never used
        String unusedData = "Temporary Data Store";
    }*/

    public static void main(String[] args) {
        System.out.println("--- Student Management System Loaded ---");
    }
}
