import java.util.*;

public class Module {
    private String moduleName;
    private int moduleID;
    private List<Student> students;
    private List<Course> courses;

    public Module(String moduleName){
        this.moduleName = moduleName;
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
    }
    //Create getters and setters methods
    public String getName(){
        return moduleName;
    }
    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
    }
    public int getID(){
        return moduleID;
    }
    public void setID(int moduleID){
        this.moduleID = moduleID;
    }
    public List<Student> getListStudents(){
        return students;
    }
    public void setListStudent(ArrayList<Student> students){

        this.students = students;
    }

    public void add(Student student_s){
        students.add(student_s);
    }
    public List<Course> getListCourse(){
        return courses;
    }
    public void addCourses(Course course_s){
        courses.add(course_s);
    }
}

