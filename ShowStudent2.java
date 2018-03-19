public class ShowStudent2
{

    
public static void main(String[] args)
        {
        Student firstStudent = new Student();
        
        firstStudent.display();
        
        System.out.println("The student's GPA is " + 
        firstStudent.computeGpa(firstStudent.pointsEarned, firstStudent.creditHoursEarned));
        }

}
