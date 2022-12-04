package P08_Mini_School_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Teachers_Menu implements Functions{
    Scanner scan = new Scanner(System.in);
    ArrayList<Teacher> teachersList= new ArrayList<>();
    public  void teachersMenu(){
       
   
        System.out.println("==============Teachers Things To Do==========\n" +
                "1-ADD \n" +
                "2-SEARCH\n" +
                "3-MAKE A LIST \n" +
                "4-DELETE\n" +
                "Q-QUIT\n" +
                "YOUR CHOICE : ");

        while (true){
            char userChoices=scan.next().toUpperCase().charAt(0);
            switch(userChoices){
                case '1': {
                    add();
                }
                case '2': {
                    search();
                }
                case '3': {
                    listing();
                }
                case '4': {
                    delete();
                }
                case 'Q': {
                    quit();

                }
            }
    }
    }
    
    @Override
    public  void add() {
        System.out.print("Please type your name: ");
        scan.nextLine();
        String userName= scan.nextLine();

        System.out.print("Please type your surname: ");

        String userSurname= scan.nextLine();
        System.out.print("Please type your Id Number: ");

        String idNo=scan.nextLine();
        System.out.print("Please type your old: ");

        int userOld= scan.nextInt();
        System.out.print("Please type your department name: ");
        scan.nextLine();
        String teacherDepartman= scan.nextLine();
        System.out.print("Please type your personel number: ");
        int personelNo= scan.nextInt();
        Teacher teachers= new Teacher(userName,userSurname,idNo,userOld,teacherDepartman,personelNo);
        teachersList.add(teachers);
        System.out.println(teachers.toString());
        System.out.println("Succesfully registered...");
        teachersMenu();
    }

    @Override
    public  void search() {
        if (!(teachersList.isEmpty())){
            System.out.println("Type id number to search a student");
            String idNoToSearch= scan.next();

            for (int i = 0; i < teachersList.size(); i++) {
                if (teachersList.get(i).getIdNumber().equals(idNoToSearch)){
                    System.out.println(teachersList.get(i));
                }

            }
            teachersMenu();
        } else
        {
            System.out.println("There is no student in the list");
            teachersMenu();
        }

    }

    @Override
    public void listing() {
        if (!(teachersList.isEmpty())){
            for (Teacher each:teachersList    ) {
                System.out.println(each.toString()+"============");
            }
            teachersMenu();
        } else {

            System.out.println("There is no student in the list");
            teachersMenu();
        }
    }

    @Override
    public void delete() {
        if (!(teachersList.isEmpty())){
            System.out.println("Type the id number to be deleted");
            String idNoToDelete= scan.next();
            for (Teacher each:teachersList    ) {
                if (each.getIdNumber().equalsIgnoreCase(idNoToDelete)){
                    teachersList.remove(each);
                    System.out.println(teachersList.toString());
                } else {
                    System.out.println("There is no id number to delete");
                }
            }
            teachersMenu();
        } else {

            System.out.println("There is no student in the list");
            teachersMenu();
        }


    }

    @Override
    public void quit() {
        First_Menu.firtsMenu();

    }
}
