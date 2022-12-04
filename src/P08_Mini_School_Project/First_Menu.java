package P08_Mini_School_Project;

import java.util.Scanner;

public class First_Menu {

    public static void firtsMenu() {

        System.out.println("====================================\n" +
                "TEACHERS AND STUDENT MANAGER PANEL\n" +
                "=========================================\n" +
                "1-STUDENT PORTAL*\n" +
                "2-TEACHERS PORTAL*\n" +
                "3-QUIT\n" +
                "YOUR CHOICE:  ");
        Scanner scan = new Scanner(System.in);
        Student_Menu studentMenu = new Student_Menu();
        Teachers_Menu teachersMenu = new Teachers_Menu();
        while (true) {
            char userChice = scan.next().charAt(0);
            switch (userChice) {
                case '1': {
                    studentMenu.studentMenu();
                }
                case '2': {
                    teachersMenu.teachersMenu();

                }
                case 'Q': {
                    System.out.println("BYE BYE");
                    System.exit(0);
                }
                default: {
                    System.out.println("Please valid choice type");
                }
            }
        }

    }
}
