public class Student{
    private String studentName;
    private int studentAge;
    private String DOB;
    private int ID;
    private String userName;


    public Student(String studentName, int studentAge, String DOB, int ID ){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.DOB = DOB;
        this.ID = ID;
    }
    //Create Getter and Setter Methods
    public Student(String studentName){

        this.studentName = studentName;
    }
    public String getSName(){

        return studentName;
    }
    public void setSName(String sName){

        this.studentName = sName;
    }
    public int getSAge(){

        return studentAge;
    }
    public void setSAge(int sAge){

        this.studentAge = sAge;
    }
    public String getDOB(){

        return DOB;
    }
    public void setDOB(String DOB){

        this.DOB = DOB;
    }
    public int getSID(){
        return ID;
    }
    public void setID(int ID){

        this.ID = ID;
    }
    //Create concatenating classes for the username
    public String getUserName(){
        String uName = studentName + ID;
        return uName;
    }
    public void setUserName(String userName){

        this.userName = userName;
    }




}

