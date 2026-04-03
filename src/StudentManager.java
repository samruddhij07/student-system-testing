import java.util.*;

public class StudentManager {
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

    public static void main(String[] args) {
        System.out.println("--- Student Management System Loaded ---");
    }
}
