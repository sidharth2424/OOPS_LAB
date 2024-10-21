import java.util.*;

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
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}

public class Q10{
    public static void main(String[] args) {
        List<Student> arr=Arrays.asList(new Student("Abhay", 21),new Student("sid", 25));

        OptionalDouble avgAge=arr.stream().mapToInt(Student::getAge).average();
        if(avgAge.isPresent()){
            System.out.println("avg age is: "+avgAge.getAsDouble());
        }
        else
        System.out.println("invslid");
    }
}