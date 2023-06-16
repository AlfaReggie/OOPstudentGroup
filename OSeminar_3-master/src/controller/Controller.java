package controller;

import java.util.List;
import data.Student;
import data.StudyGroup;
import data.Teacher;
import service.DataServiceImpl;
import service.StudyGroupServiceImpl;


public class Controller {

    private DataServiceImpl dataService = new DataServiceImpl();
    private StudyGroupServiceImpl studyGroupServiceImpl = new StudyGroupServiceImpl();

    public StudyGroup createGroup(List<Student> inputList, Teacher teacher) {
        return studyGroupServiceImpl.createGroup(inputList, teacher);
    }

    public void readGroup(StudyGroup group) {
        studyGroupServiceImpl.readGroup(group);
    }

    public StudyGroup addStudentToGroup(StudyGroup group, Student student) {
        return studyGroupServiceImpl.addStudentToGroup(group, student);
    }

    public void create(List<Student> inputList, Teacher teacher) {
        if (inputList != null && teacher != null) {
            dataService.create(inputList, teacher);
        } else {
            System.out.println("Wrong data!");
        }
    }

    public void create(Student inputStudent) {
        dataService.create(inputStudent);
    }

    public void read() {
        dataService.read();
    }

}