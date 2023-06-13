package main.java.ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class TeachGroupIterator implements Iterator<Teacher>{
    private int counter;
    private List<Teacher> list;

    public TeachGroupIterator(TeachGroup list) {
        this.list = list.getTeachers();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext()){
            throw new RuntimeException("Exception");
        }
        return list.get(counter++);
    }
}