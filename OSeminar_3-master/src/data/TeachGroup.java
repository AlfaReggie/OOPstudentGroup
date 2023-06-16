package data;

import java.util.List;
public class TeachGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public TeachGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                '}';
    }

    @Override
    public TeachGroupIterator iterator() {
        return new TeachGroupIterator(this);
    }

    public void sort(TeachComparator userUserComparator) {
    }
}