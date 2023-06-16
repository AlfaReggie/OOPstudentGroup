package service;

import java.util.ArrayList;
import java.util.List;
import data.Student;
import data.Teacher;

public class DataServiceImpl implements Service {

    static Integer idGenerator;
    List<Student> studentList;
    Teacher teacher;

    public DataServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        this.studentList.addAll(inputList);
        this.teacher = teacher;
    }

    @Override
    public void create(Student inputStudent) {
        this.studentList.add(inputStudent);
    }

    @Override
    public void read() {
        System.out.println(this.teacher);
        for (Student s: studentList) {
            System.out.println("\t" + s.toString());
        }
    }

}
