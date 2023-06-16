package service;

import java.util.List;

import data.Student;
import data.Teacher;

public interface Service {

    public void create(List<Student> inputList, Teacher teacher);

    public void create(Student inputStudent);

    public void read();

}
