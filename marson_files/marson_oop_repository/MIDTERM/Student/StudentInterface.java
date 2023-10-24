package Student;
import java.util.Scanner;

public class StudentInterface {
   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      Student student = new Student();
      
      System.out.print("Enter First Name: ");
      student.setFirstName(scan.next());
      System.out.print("Enter Middle Name: ");
      student.setMiddleName(scan.next());
      System.out.print("Enter Last Name: ");
      student.setLastName(scan.next());
      System.out.print("Enter Suffix Name: ");
      student.setSuffix(scan.next());
      
      System.out.println("First Name: " + student.getFirstName());
      System.out.println("Middle Name: " + student.getMiddleName());
      System.out.println("Last Name: " + student.getLastName());
      System.out.println("Suffix: " + student.getSuffix());
      System.out.println("Full Name: " + student.getFullName());
   }
}