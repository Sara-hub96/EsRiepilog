
/*Finally, write a Main class in which we will test our code. In the main method, the following should be done: • Create 4 students
 and 2 professors using the different constructors. • Test the assignGrade() method with input parameters of your choice. • Put the students
  in an array and do the same for the professors. • Print the first names and last names of all excellent students. • Print the first name
   and last name of the student with the highest grade average.
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1001, "Marco", "Bianchi", LocalDate.of(2001, 12, 20), new ArrayList<>());
        Student student2 = new Student(1002, "Lucia", "Romeo", LocalDate.of(2002, 11, 2), new ArrayList<>());
        Student student3 = new Student(1003, "Rosa", "Neri", LocalDate.of(1992, 1, 25), new ArrayList<>());
        Student student4 = new Student(1004, "Miriam", "De Palma", LocalDate.of(1997, 3, 15), new ArrayList<>());

        Professor professor1 = new Professor(0001, "Maria", "Rossi", "Scenografia");
        Professor professor2 = new Professor(0002, "Francis", "Smith");

        professor1.assignGrade(student1, 30);
        professor1.assignGrade(student2, 28);
        professor1.assignGrade(student3, 30);
        professor1.assignGrade(student4, 27);

        professor2.assignGrade(student1, 30);
        professor2.assignGrade(student2, 25);
        professor2.assignGrade(student3, 28);
        professor2.assignGrade(student4, 24);

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        Professor[] professors = new Professor[2];
        professors[0] = professor1;
        professors[1] = professor2;


        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student.getName() + " " + student.getSurname());

            }
        }

        Student bestStudent = students[0];
        for (Student student : students) {
            if(student.calculateGradeAverage() > bestStudent.calculateGradeAverage()){
                student = bestStudent;
            }
        }
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname());
    }
}


