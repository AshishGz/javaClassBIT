import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRecord {

    void addStudentRecord(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=scanner.nextLine();
        System.out.println("Enter Faculty:");
        String facutly=scanner.nextLine();
        System.out.println("Enter Section:");
        String section=scanner.nextLine();
        System.out.println("Enter Phone Number:");
        String phone=scanner.nextLine();
        System.out.println("Enter Email:");
        String email=scanner.nextLine();
        System.out.println("Enter Address:");
        String address=scanner.nextLine();
        try {
            FileWriter fileWriter=new
                    FileWriter("student_record.txt");
            fileWriter.write("Name:: "+name);
            fileWriter.write("\nFaculty:: "+facutly);
            fileWriter.write("\nSection:: "+section);
            fileWriter.write("\nPhone Number:: "+phone);
            fileWriter.write("\nEmail:: "+email);
            fileWriter.write("\nAddress:: "+address);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
