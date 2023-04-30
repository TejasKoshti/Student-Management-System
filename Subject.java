package Day3.Application2;

public class Subject {

    private int sId;
    private String sName;
    private double sFee;

    public Subject(int sId, String sName, double sFee) {
        this.sId = sId;
        this.sName = sName;
        this.sFee = sFee;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getsFee() {
        return sFee;
    }

    public void setsFee(double sFee) {
        this.sFee = sFee;
    }
}
