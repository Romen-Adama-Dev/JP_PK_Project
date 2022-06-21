public class Student {
    /*
    Constructor for Student
     */
    private int id;
    private String name;
    private int grade;

    public Student(int id, String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
/*
    @author
    Romen Adama Caetano Ramirez
    Date: 17/01/2022
 */
