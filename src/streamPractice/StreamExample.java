package streamPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    List<Student> students;

    StreamExample() {
        students = new ArrayList<>();
        init(students);
    }

    private void init(List<Student> students) {
        Student student = new Student();
        student.setEmail("s1@gmail.com");
        student.setName("Rashed Alam");
        student.setPhoneNumber(null);
        student.setTotalMarks(800);
        students.add(student);

        Student student2 = new Student();
        student2.setEmail("s2@yahoo.com");
        student2.setName("Sajjad Hossain");
        student2.setPhoneNumber(null);
        student2.setTotalMarks(700);
        students.add(student2);

        Student student3 = new Student();
        student3.setEmail("s3@gmail.com");
        student3.setName("Ikhtiar Uddin Mitul");
        student3.setPhoneNumber(null);
        student3.setTotalMarks(750);
        students.add(student3);

        Student student4 = new Student();
        student4.setEmail("s4@gmail.com");
        student4.setName("Mohi Uddin");
        student4.setPhoneNumber(null);
        student4.setTotalMarks(800);
        students.add(student4);

        Student student5 = new Student();
        student5.setEmail("s5@gmail.com");
        student5.setName("Abdullah Al Masud");
        student5.setPhoneNumber(null);
        student5.setTotalMarks(800);
        students.add(student5);
    }

    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();

        /**
         * anyMatch and allMatch accepts a predicate.
         * Predicate is a functional interface which returns a boolean value
         * anyMatch check if any one of the element are match then return true otherwise return false
         * allMatch check if all the elements are match then return true otherwise return false
         * **/

        System.out.println("========== anyMatch and allMatch Practice =========");
        var match = streamExample.students.stream().allMatch(student -> student.getName().equals("Rashed Alam"));
        System.out.println(match);

        /**
         * filter accepts a predicate
         * filter returns a new stream according to given predicate
         * forEach accepts a consumer.
         * consumer is a function which takes an argument, produce a result and don't return any value
         * sorted accepts comparator interface and sort according to given logic
         * **/

        System.out.println("========== filter, sorted and forEach Practice =========");
        streamExample
                .students
                .stream()
                .filter(student -> student.getEmail().contains("gmail.com"))
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

        System.out.println("========== limit, map, toList, toSet Practice =========");
        streamExample.students
                .stream()
                .filter(student -> student.getTotalMarks() > 700)
                .limit(3)
                .sorted(Comparator.comparing(Student::getTotalMarks).reversed())
                .map(student -> {
                    var obj = new HashMap<String, Object>();
                    obj.put(student.getName(), student.getTotalMarks());
                    return obj;
                })
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

}

class Student {
    private String name;
    private String email;
    private String phoneNumber;
    private int totalMarks;

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
