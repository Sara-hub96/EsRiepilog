/*Design the Student class. • The attributes are a student ID, a first name, a last name, a date of birth, and a list containing the
grades obtained by the student. • Write a constructor for this class that takes all the attributes and another constructor that
 initializes the grades list as empty, along with getters and setters for all attributes. • The class will also have the following methods:
  ▪ calculateGradeAverage(), which calculates the student's grade average. ▪ isExcellent(), which returns true if the student's grade average
   is greater than or equal to
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private List<Integer> grades;

    public Student (int id, String name, String surname, LocalDate dateOfBirth, List<Integer> grades){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    public Student (List<Integer> grades){
        grades.isEmpty();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public int calculateGradeAverage(List<Integer> grades){
          int sum = 0, avg;
          for (int i = 0; i < grades.size(); i++){
               sum+= grades.get(i);
          }
          avg = sum / getGrades().size();
          return avg;
    }

    public boolean isExcellent(){
       return calculateGradeAverage(grades) > 28;
    }
}


