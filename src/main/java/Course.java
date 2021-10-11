import org.joda.time.DateTime;
import java.util.*;


public class Course {
    private DateTime startDate, endDate;
    private String courseName;
    private List<Student> students;


    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<Student>();
    }

    //Create getters and setters methods
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //create method to store the list of student
    public List<Student> getListStudents(){
        return students;
    }
    public void setListStudent(List<Student> students){
        this.students = students;
    }
    public void add(Student student){
        students.add(student);
    }



}

