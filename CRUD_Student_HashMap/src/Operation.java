import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Operation {


    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static Map<Integer, Student> studentMap = new HashMap<>();


    public static void create() {


        try {
            System.out.println("Enter RollNo: ");
            int rollno = Integer.parseInt(bf.readLine());
            System.out.println("Enter Name: ");
            String name = bf.readLine();
            Student student = new Student(rollno, name);
            studentMap.put(student.getRollNo(), student);
            System.out.println("Student Added");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void read() {
        if (studentMap.isEmpty()) {
            System.out.println("No Student Found");

        } else {
            for (Student student : studentMap.values()) {
                System.out.println("\n" + student);
            }
        }
    }

    public static void update() {
        System.out.println("Enter RollNo Number You Want to Update");
        try {
            int uroll = Integer.parseInt(bf.readLine());

            if (studentMap.containsKey(uroll)) {
                System.out.println("Enter New Name");
                String newname = bf.readLine();
                Student student = new Student(uroll, newname);
                studentMap.replace(uroll, student);
                System.out.println("Updated Successfully");
            } else {
                System.out.println("Student Not Found");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete() {
        System.out.println("Enter RollNo to Delete:");
        try {
            int dtroll = Integer.parseInt(bf.readLine());
            if (studentMap.containsKey(dtroll)) {
                studentMap.remove(dtroll);
                System.out.println("Student Deleted Successfully");
            } else {
                System.out.println("Student Not Found");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
