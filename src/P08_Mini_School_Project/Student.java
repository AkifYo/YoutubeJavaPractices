package P08_Mini_School_Project;

public class Student extends Personel{
    private String classes;
    private int studentNo;

    public Student(String name, String surname, String idNumber, int old, String classes, int studentNo) {
        super(name, surname, idNumber, old);
        this.classes = classes;
        this.studentNo = studentNo;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return  super.toString()  +
                "CLASS : " + classes + "\n" +
                "STUDENT NO : " + studentNo ;
    }
}
