public class StudentManager {

    // Logic: Convert a numerical score into a Letter Grade
    public String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid Score";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    // Logic: Determine if the student passed (40 is the passing mark)
    public boolean isPassed(int score) {
        return score >= 40 && score <= 100;
    }

    public static void main(String[] args) {
        System.out.println("--- Student Management System Loaded ---");
        // In a real app, a Scanner would go here to take user input
    }
}