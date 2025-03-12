package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedStudents {

    private final List<Student> students;

    private SortedStudents(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public static SortedStudents of(List<Student> students){
        return new SortedStudents(students);
    }

    public SortedStudents sortAgeDesc(){
        List<Student> studentList = new ArrayList<>(students);
        studentList.sort((a,b) -> b.getAge() - a.getAge());
        return of(studentList);
    }

    public SortedStudents sortAgeDescAndNameDesc(){
        ArrayList<Student> studentList = new ArrayList<>(students);
        studentList.sort((Student a,Student b) -> {
            int result = Integer.compare(b.getAge(), a.getAge());
            if(result != 0) return result;

            return b.getName().compareTo(a.getName());
        });
        return of(studentList);
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
}