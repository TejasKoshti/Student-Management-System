package Day3.Application2;

import java.util.ArrayList;
import java.util.List;

public class BLClass {

    int i=0;
    private static List<Student> data =new ArrayList<>();

    public void addData(Student s)
    {
        data.add(s);
    }

    public void displayStudent(int rollNo){

    }

    public void DisplaySubject(String sName) {
        for (Student s: data){
            if (s.getSubject().getsName().equals(sName)){
                System.out.println(s.getRoolNol());
                System.out.println(s.getName());
                System.out.println(s.getMarks());
                System.out.println(s.getSubject().getsId());
                System.out.println(s.getSubject().getsName());
                System.out.println(s.getSubject().getsId());
            }
        }
    }

    public void searchData(int id) {
        for (Student s : data){
            if (s.getRoolNol() == id){

                System.out.println(s.getRoolNol());
                System.out.println(s.getName());
                System.out.println(s.getMarks());
                System.out.println(s.getSubject().getsId());
                System.out.println(s.getSubject().getsName());
                System.out.println(s.getSubject().getsFee());
                System.out.println("Student Found");
                return;
            }
        }
        System.out.println("Student Wth ID" +id+ "Was not Found.");
    }

    public void updateSuject(int sId, Subject newSubject) {
        for (i=0; i< data.size();i++){
            if (data.get(i).getRoolNol() ==sId){
                data.get(i).setSubject(newSubject);

            }
        }
        System.out.println("New Subject Updated Successfully");
    }

    public void removeData(int id) {
        for (Student student : data){
            if (student.getRoolNol() == id){
                data.remove(student);
                System.out.println("Student with ID " +id + " has been Removed");
                return;
            }
        }
        System.out.println("Student With ID" +id+ "was not Found");
    }

    public void displaydata() {
        for (Student student : data){
            System.out.println(student.getRoolNol());
            System.out.println(student.getName());
            System.out.println(student.getMarks());
            System.out.println(student.getSubject().getsId());
            System.out.println(student.getSubject().getsName());
            System.out.println(student.getSubject().getsFee());
        }
    }
}
