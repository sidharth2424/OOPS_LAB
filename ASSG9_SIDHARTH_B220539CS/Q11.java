import java.util.*;
import java.util.stream.Collectors;

class Student{
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name +" "+ age;
    }
    
}

public class Q11{
    public static void main(String[] args) {
        List<Student> arr=Arrays.asList(new Student("Abhay", 21),new Student("sid", 25),new Student("basu", 12));

        List<Student> res=arr.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());

        res.forEach(System.out::println);
    }
}