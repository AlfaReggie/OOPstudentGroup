package service;

import data.Student;
import data.Teacher;
import data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    static Integer idGenerator;
    List<Student> studentList;
    Teacher teacher;
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(countMaxId, firstName, secondName, patronymic, dateOfBirth);
        this.users.add(student);
    }
}
