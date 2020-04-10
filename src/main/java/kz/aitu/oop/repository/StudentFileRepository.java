package kz.aitu.oop.repository;

import kz.aitu.oop.entity.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFileRepository {

    private static final String FILE_LOCATION = "C:\\Users\\OlzhasTulzhanov\\Desktop\\student.txt";

    public List<Student> getStudents() throws FileNotFoundException {

        File file = new File(FILE_LOCATION);
        Scanner sc = new Scanner(file);

        List<Student> studentList = new ArrayList<>();
        while (sc.hasNextLine()) {
            Student student = new Student();
            String group = sc.next();
            student.setName(sc.next());
            student.setAge(sc.nextInt());
            student.setPoint(sc.nextDouble());
            studentList.add(student);
        }

        return studentList;
    }

    public static void main(String[] args) throws FileNotFoundException {
        StudentFileRepository studentFileRepository = new StudentFileRepository();

        for (Student student: studentFileRepository.getStudents()) {
            System.out.println(student);
        }
    }
}

