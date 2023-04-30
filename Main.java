package Day3.Application2;

import java.util.Scanner;

public class Main {
        static Scanner sc =new Scanner(System.in);
        static BLClass bl=new BLClass();
        public static void main(String[] args) {
            boolean status = true ;
            do {
                System.out.println("--------------------------------------------");
                System.out.println("1. Add Student ");
                System.out.println("2. Display details ");
                System.out.println("3. Remove Student");
                System.out.println("4: Update student Subject");
                System.out.println("5: Search student by ID");
                System.out.println("6: Display student by Subject");
                System.out.println("7: Exit");
                System.out.println("--------------------------------------------");
                int ch = sc.nextInt();
                System.out.println("--------------------------------------------");

                switch (ch)
                {
                    case 1 :
                        addStudent();
                        break;

                    case 2 :
                        displayStudent();
                        break;

                  case 3:
                        removeStudent();
                        break;

                  case 4 :
                        updateStudentsSubject();
                        break;

                    case 5 :
                        searchStudentById();
                        break;

                    case 6 :
                        displayStudentBySubject();
                        break;

                    case 7 :
                        status = false;
                        break;

                    default:
                        System.out.println("Invalid Input !!");
                }

            }while (status);
    }

    private static void displayStudentBySubject() {
        System.out.println("Enter The Subject Name");
        String sName=sc.next();
        bl.DisplaySubject(sName);
    }

    private static void searchStudentById() {
        System.out.println("Enter the ID");
        int id= sc.nextInt();
        bl.searchData(id);
    }

    private static void removeStudent() {
        System.out.println("Enter the Student ID");
        int id= sc.nextInt();
        bl.removeData(id);
    }

    private static void updateStudentsSubject() {
        System.out.println("Enter The stud ID");
        int sId= sc.nextInt();
        System.out.println("Enter The Subject Name To Update ");
        Subject newSubject= addSubject();
        bl.updateSuject(sId,newSubject);
    }

    private static void addStudent() {
        System.out.println("Enter the Roll No" );
        int rollNo =sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter The Marks");
        int marks= sc.nextInt();
        System.out.println("Enter The Subject");
        Subject sub=  addSubject();

        Student s1=new Student(rollNo,name,marks,sub);
        bl.addData(s1);

    }

    private static Subject addSubject(){
        System.out.println("Enter the Sub ID" );
        int sId =sc.nextInt();
        System.out.println("Enter the Sub Name");
        String sName = sc.next();
        System.out.println("Enter the Sub Fee");
        int sFee= sc.nextInt();

        Subject s=new Subject(sId,sName,sFee);
        return s;
    }
    private static void displayStudent(){
            bl.displaydata();

    }
}
