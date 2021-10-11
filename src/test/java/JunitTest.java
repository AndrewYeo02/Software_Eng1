import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {

    public static void main(String[] args){
        JunitTest test = new JunitTest();
        test.basicStudentTest();
    }
    @Test
    public void basicStudentTest(){
        Student student = new Student("John", 22, "12-12-1999", 001);

        String name = student.getSName();
        assertEquals("John", name);
    }
}
