package Day3.Application2;

public class Student {

    private int roolNol;
    private String name;
    private double marks;
    private Subject subject;

    public Student(int roolNol, String name, double marks, Subject subject) {
        this.roolNol = roolNol;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public int getRoolNol() {
        return roolNol;
    }

    public void setRoolNol(int roolNol) {
        this.roolNol = roolNol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
