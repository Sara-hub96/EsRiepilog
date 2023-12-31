import java.util.List;

/*Design the Professor class. • The attributes are an ID, a first name, a last name, and the name of the course taught by the professor
. • Write a constructor for this class that takes all the attributes and another constructor without the course taught, along with getters and
 setters for all attributes. • The class will also have the following method: ▪ assignGrade(Student s, int grade), which adds the grade to
  the student s grades list if the grade is greater than or equal to 18; otherwise, it prints a message to inform the student that they have
  failed.
 */
public class Professor {
    private int id;
    private String name;
    private String surname;
    private String course;

    public Professor(int id, String name, String surname, String course){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    public Professor(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

   public void assignGrade(Student s, int grade){
        if (grade >= 18){
          s.getGrades().add(grade);
        }else {
            System.out.println("Mi dispiace non ha superato l'esame");
        }
    }
}

