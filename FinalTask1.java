public class FinalTask1 {
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents];
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + students[i].getName());
        }
    }
}

class Contact {
    private String email;
    private int number;

    public Contact(String email, int number) {
        this.email = email;
        this.number = number;
    }

    public void showContactInfo() {
        System.out.println(" Email: " + email);
        System.out.println("Number: " + number);
    }
}

public class AssociationRelationship {
    public static void main(String[] args) {

        School school = new School("Shaheen School", numberOfStudents : 4);
        school.addStudent(new Student("Swarnadip"));
        school.addStudnt(new Student("Fuad"));
        school.addStudent(new Student("Musfique"));
        school.addStudent(new Student("Fahad"));
        school.showStudents();
        System.out.println();

        Contact cntc = new Contact("swarnadweepsarkar17@gmail.com", 01902527967);

        school.showContactInfo();
    }
}
}
