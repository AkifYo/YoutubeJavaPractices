package P08_Mini_School_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Menu implements Functions{
    ArrayList<Student> studentsList= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
   void studentMenu(){

       System.out.println("===========Things To Do=========\n" +
               "1-ADD\n" +
               "2-SEARCH\n" +
               "3-MAKE A LIST\n" +
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
    public void add() {
        System.out.print("Please type your name: ");
        scan.nextLine();
        String userName= scan.nextLine();

        System.out.print("Please type your surname: ");

        String userSurname= scan.nextLine();
        System.out.print("Please type your Id Number: ");

        String idNo=scan.nextLine();
        System.out.print("Please type your old: ");

        int userOld= scan.nextInt();
        System.out.print("Please type your class name: ");
        scan.nextLine();
        String classesName= scan.nextLine();
        System.out.print("Please type your student number: ");
        int studentNo= scan.nextInt();
        Student student= new Student(userName,userSurname,idNo,userOld,classesName,studentNo);
        studentsList.add(student);
        System.out.println(student.toString());
        System.out.println("Succesfully registered...");
        studentMenu();
    }

    @Override
    public void search() {
       if (!(studentsList.isEmpty())){
            System.out.println("Type id number to search a student");
            String idNoToSearch= scan.next();

           for (int i = 0; i < studentsList.size(); i++) {
               if (studentsList.get(i).getIdNumber().equals(idNoToSearch)){
                   System.out.println(studentsList.get(i));
               }

           }
           studentMenu();
        } else
        {
            System.out.println("There is no student in the list");
            studentMenu();
        }

    }

    @Override
    public void listing() {
       if (!(studentsList.isEmpty())){
            for (Student each:studentsList    ) {
                System.out.println(each.toString()+"============");
            }
            studentMenu();
        } else {

           System.out.println("There is no student in the list");
           studentMenu();
        }

    }

    @Override
    public void delete() {
        if (!(studentsList.isEmpty())){
            System.out.println("Type the id number to be deleted");
            String idNoToDelete= scan.next();
            for (Student each:studentsList    ) {
               if (each.getIdNumber().equalsIgnoreCase(idNoToDelete)){
                   studentsList.remove(each);
                   System.out.println(studentsList.toString());
               } else {
                   System.out.println("There is no id number to delete");
               }
            }
            studentMenu();
        } else {

            System.out.println("There is no student in the list");
            studentMenu();
        }

    }

    @Override
    public void quit() {
       First_Menu.firtsMenu();

    }
}
