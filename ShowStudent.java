import java.util.Scanner;
public class ShowStudent
{

    public static void main(String[] args)
        {
        Student firstStudent = new Student();
        firstStudent = getData(firstStudent);
        
        firstStudent.display();
        
        System.out.println("The student's GPA is " + 
        firstStudent.computeGpa(firstStudent.pointsEarned, firstStudent.creditHoursEarned));
        }
        
    public static Student getData(Student s)
        {
        int idNumber;
        double creditHoursEarned;
        double pointsEarned;
        double gpa;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter student ID number >> ");
        idNumber = keyboard.nextInt();
        System.out.print("Enter the number of credit hours the student has earned >> ");
        creditHoursEarned = keyboard.nextDouble();
        System.out.print("Enter the number of points the student has earned >> ");
        pointsEarned = keyboard.nextDouble();
        
        s.setIdNumber(idNumber);
        s.setCreditHoursEarned(creditHoursEarned);
        s.setPointsEarned(pointsEarned);
        s.computeGpa(pointsEarned, creditHoursEarned);
        
        return s;
        }

}