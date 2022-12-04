package P08_Mini_School_Project;

public class Personel {
    private String name;
    private String surname;
    private String idNumber;
    private int old;

    public Personel(String name, String surname, String idNumber, int old) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "NAME : " + name + "\n" +
                "SURNAME : " + surname + "\n" +
                "ID NUMBER : " + idNumber + "\n" +
                "OLD : " + old +"\n" ;
    }
}
