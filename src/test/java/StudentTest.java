//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import java.util.List;
import org.joda.time.DateTime;

public class StudentTest {

    private Student student_1;
    private Student student_2;

    private Module module_2;
    private Course course_1;
    private Module module_1;

    @Before
    public void setUp() throws Exception {
        student_1 = new Student("AndrewYeo", 24, "07-04-1998", 18);
        student_2 = new Student("DianaQian", 23, "10-01-1999", 19284498);
        module_1 = new Module("CT123");
        course_1 = new Course("4BCT1", new DateTime("2021-09-01"), new DateTime("2024-05-22"));
    }

    @Test
    public void testStudentUsername() {
        String username = "AndrewYeo18";
        String testUsername = student_1.getUserName();
        assertEquals("pass",username, testUsername);
    }

    @Test
    public void testStudentCourse() {
        student_1.setCourses(course_1);
        Course testCourse =  new Course("4BCT1", new DateTime("2021-09-01"), new DateTime("2024-05-22"));
        Course course = student_1.getCourse();
        assertEquals("pass", course.getCourse(), testCourse.getCourse());
    }

    @Test
    public void test_module() {
        student_1.addModules(module_1);
        List<Module> current= student_1.getModules();
        assertEquals("CT123",current.get(0).getName());
    }









}
