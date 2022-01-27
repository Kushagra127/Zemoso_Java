package Assignment_12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(111, "Jiya Brein",17, "Female","Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui",18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron",17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda",18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain",18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma",16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu",20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(199, "Amelia Zoe",18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough",18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur",20, "Female", "Electronic", 2019, 83));
        students.add(new Student(244, "Nicolus Den",16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig",17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey",17,"Female", "Electric", 2019, 72.4));
        students.add(new Student(233, "Jyothi Reddy",16,"Female", "Computer Science", 2015, 45.6));
        students.add(new Student(277, "Anuj Chettiar",18,"Male", "Computer Science", 2017, 57.5));

//         1. Print the name of all departments in the college?

                students.stream().
                map(Student::getEngDepartment)
                .distinct().forEach(System.out::println);

        //2.Get the names of all students who have enrolled after 2018?
        System.out.println("*********");

        Stream<Student>filtered_enrolled=students.stream().filter(s->s.yearOfEnrollment>2018);
        filtered_enrolled.forEach(
                s -> System.out.println(s.name)
        );
        System.out.println("*********");

//        System.out.println("3rd Question");
//        3. Get the details of all male student in the computer sci department?
        Stream<Student>filtered_department=students.stream().filter(e -> e.getGender()=="Male" && e.getEngDepartment()=="Computer Science");
        filtered_department.forEach(
                student -> System.out.println(student.name+" "+student.id+student.yearOfEnrollment)
        );
        System.out.println("*********");

//        4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)

        Map<String, Long> noOfMaleAndFemaleEmployees=
                students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

        System.out.println("*********");

//        5.What is the average age of male and female students?
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);

        System.out.println("*********");

//        6.Get the details of highest student having highest percentage ?
        Optional<Student> highestPerStudent=
                students.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate)));

        Student highestpercentage = highestPerStudent.get();

        System.out.println("Details Of Highest Percenatgae Student : ");

        System.out.println("==================================");

        System.out.println("ID : "+highestpercentage.getId());
        System.out.println("Name : "+highestpercentage.getName());
        System.out.println("Age : "+highestpercentage.getAge());
        System.out.println("Gender : "+highestpercentage.getGender());
        System.out.println("Department : "+highestpercentage.getEngDepartment());
        System.out.println("Year Of Joining : "+highestpercentage.getYearOfEnrollment());
        System.out.println("Max Percenatge :"+highestpercentage.getPerTillDate());

        System.out.println("*********");
//        7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
        Map<String, Long> studentCountByDepartment=
                students.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = studentCountByDepartment.entrySet();

        for (Map.Entry<String, Long> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("*********");

//        8. What is the average percentage achieved in each department?
        Map<String, Double> avgPerOfDepartments=
                students.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));

        Set<Map.Entry<String, Double>> entrySet1 = avgPerOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet1)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("*********");

//        9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        Optional<Student> youngestMaleStudentInElectronicDepartmentWrapper=
                students.stream()
                        .filter(e -> e.getGender()=="Male" && e.getEngDepartment()=="Electronic")
                        .min(Comparator.comparingInt(Student::getAge));

        Student youngestMaleEmployeeInElectornicsDevelopment = youngestMaleStudentInElectronicDepartmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+youngestMaleEmployeeInElectornicsDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInElectornicsDevelopment.getName());

        System.out.println("Age : "+youngestMaleEmployeeInElectornicsDevelopment.getAge());

        System.out.println("Year Of Enrollment : "+youngestMaleEmployeeInElectornicsDevelopment.getYearOfEnrollment());

        System.out.println("Salary : "+youngestMaleEmployeeInElectornicsDevelopment.getPerTillDate());

        System.out.println("*********");
      //    10.How many male and female students are there in the computer science department?
        Map<String, Long> countMaleFemaleEmployeesInComputerScience=
                students.stream()
                        .filter(e -> e.getEngDepartment()=="Computer Science")
                        .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInComputerScience);
        System.out.println("*********");

    }

}
