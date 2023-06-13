import main.java.ru.gb.oseminar.data.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentGroup students = new StudentGroup(List.of(new Student(3, "String firstName",
                "String secondName",
                "String patronymic", LocalDate.now()),new Student(2, "String firstName2",
                "String secondName",
                "String patronymic", LocalDate.now()),
                new Student(1 ,"a",
                "a",
                "a", LocalDate.now())));
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next().toString());
        }
            System.out.println("////////////////////////////////////");
        List<Student> list = students.getStudents().stream().sorted()
                 .collect(Collectors.toList());
        System.out.println(list.toString());

        TeachGroup teachers = new TeachGroup(List.of(new Teacher(3L, "String firstName",
                        "String secondName",
                        "String patronymic", LocalDate.now()), new Teacher(2L, "String firstName2",
                        "String secondName",
                        "String patronymic", LocalDate.now()), new Teacher(1L,"a",
                        "a", "a", LocalDate.now())));

        System.out.println("teachers");
        System.out.println(teachers + "\n");

        System.out.println("Iterator:");
        TeachGroupIterator iterator = teachers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("Comparator:");
        List<Teacher> listTeach = teachers.getTeachers().stream().sorted()
                .collect(Collectors.toList());
        System.out.println(listTeach.toString());
    }
}
