import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class StudentManagerTest {

    StudentManager manager = new StudentManager();

    @Test
    public void testGradeA() {
        // If a student gets 95, they MUST get an "A"
        assertEquals("A", manager.calculateGrade(95));
    }

    @Test
    public void testFailingGrade() {
        // If a student gets 30, they MUST get an "F"
        assertEquals("Z", manager.calculateGrade(30));
    }

    @Test
    public void testPassStatus() {
        // 40 should be a pass
        assertFalse("Score of 40 should pass", manager.isPassed(40));
    }

    @Test
    public void testFailStatus() {
        // 39 should be a fail
        assertFalse("Score of 39 should fail", manager.isPassed(39));
    }

    @Test
    public void testInvalidScore() {
        // Testing "Edge Case": What if the score is 150?
        assertEquals("Invalid Score", manager.calculateGrade(150));
    }

    @Test
    public void testWithError() {
        String name = null;
        // This will throw a NullPointerException because 'name' is null
        int length = name.length(); 
        assertEquals(5, length);
    }

    @Ignore("Waiting for database connection")
    @Test
    public void testDatabaseLogic() {
        // This code will NOT run
        assertEquals(100, manager.calculateScore());
    }
}


