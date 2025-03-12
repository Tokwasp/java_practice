package sort;

import java.util.List;

public class StudentSortMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("1번 학생","남",10),
                new Student("2번 학생","여",10),
                new Student("3번 학생","남",12),
                new Student("4번 학생","여",14),
                new Student("5번 학생","남",20)
        );

        SortedStudents sortedStudents = SortedStudents.of(students);
        SortedStudents ageDescSortedStudents = sortedStudents.sortAgeDesc();
        System.out.println("ageDescSortedStudents = " + ageDescSortedStudents.getStudents());

        System.out.println();
        SortedStudents sortAgeDescAndNameAscStudents = sortedStudents.sortAgeDescAndNameDesc();
        System.out.println("sortAgeDescAndNameAscStudents = " + sortAgeDescAndNameAscStudents.getStudents());
    }
}
