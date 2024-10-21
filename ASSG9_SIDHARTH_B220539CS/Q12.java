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

public class Q12
{
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
	    
	    Map<Integer, List<String>> groupedByAge = arr.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(groupedByAge);
	}
}