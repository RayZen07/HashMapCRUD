public class Student {
    private int RollNo;
    private String name;

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        this.RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RollNo:" + RollNo +" "+
                "Name:" + name;
    }

    public Student(int rollNo, String name) {
        RollNo = rollNo;
        this.name = name;
    }

}
