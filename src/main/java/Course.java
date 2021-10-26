import org.joda.time.DateTime;
import java.util.*;


public class Course {
    private DateTime startDate, endDate;
    private String courseName;
    private List<Student> students;
    private List<Module> modules;



    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<Student>();
        this.modules = new ArrayList<Module>();
    }

    //Create getters and setters methods
    public String getCourse(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    //create method to store the list of student

    public List<Student> getListStudents(){
        return students;
    }
    public void setListModules(List<Module> modules){this.modules = modules;}

    public void setListStudent(List<Student> students){
        this.students = students;
    }

    public void add(Student student){
        students.add(student);
    }
    public List<Module> getModules(){
        return modules;
    }

    public void addModule(Module module){
        modules.add(module);
    }


    public void setModules(Module module_1, Module module_2){
        modules.add(module_1);
        modules.add(module_2);
    }



}

