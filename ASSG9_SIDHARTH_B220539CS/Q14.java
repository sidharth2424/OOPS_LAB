import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Q14 {
    public static void main(String[] args) {
        List<Student> arr = Arrays.asList(
            new Student("Alice", 20),
            new Student("Bob", 21),
            new Student("Charlie", 20),
            new Student("David", 22),
            new Student("Eve", 21),
            new Student("Frank", 20),
            new Student("Grace", 23),
            new Student("Hannah", 22),
            new Student("Isaac", 21),
            new Student("Jack", 20)
        );

        Optional<Student> oldest = arr.stream()
            .reduce((s1, s2) -> s1.getAge() > s2.getAge() ? s1 : s2);

        if (oldest.isPresent()) {
            Student student = oldest.get();
            System.out.println("Student name: " + student.getName() + "\nStudent age: " + student.getAge());
        } else {
            System.out.println("No students available.");
        }
    }
}
