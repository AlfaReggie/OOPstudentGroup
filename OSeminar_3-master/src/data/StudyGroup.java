package data;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    List<Student> studentList;
    protected Teacher teacher;

    public StudyGroup(List<Student> inputList, Teacher teacher) {
        this.studentList = new ArrayList<>(List.copyOf(inputList));
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}