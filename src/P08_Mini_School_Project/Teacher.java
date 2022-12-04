package P08_Mini_School_Project;

public class Teacher extends Personel {
    private String department;
    private int personelNo;

    public Teacher(String name, String surname, String idNumber, int old, String department, int personelNo) {
        super(name, surname, idNumber, old);
        this.department = department;
        this.personelNo = personelNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DEPARMENT : " + department +"\n"+
                "PERSONEL NO : " + personelNo ;
    }
}
