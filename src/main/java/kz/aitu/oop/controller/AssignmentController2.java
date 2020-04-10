package kz.aitu.oop.controller;


import kz.aitu.oop.entity.Student;
import kz.aitu.oop.examples.Point;
import kz.aitu.oop.repository.StudentFileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api/task/2")
public class AssignmentController2 {


    @GetMapping("/students")
    public ResponseEntity<?> getStudents() throws FileNotFoundException {

        StudentFileRepository studentFileRepository = new StudentFileRepository();

        String result = "";
        for (Student student: studentFileRepository.getStudents()) {
            result += student.getName() + "\t" + student.getAge() + "\t" + student.getPoint() + "</br>";
        }

        return ResponseEntity.ok(result);
    }

    /**
     * Method get all Students from file and calculate average name lengths
     * @return average name length of the all students
     * @throws FileNotFoundException
     */
    @GetMapping("/averageStudentsNameLength")
    public ResponseEntity<?> averageStudentsNameLength() throws FileNotFoundException {

        double average = 0;
        //my code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();

        double total = 0;
        int count = 0;
        for (Student student: studentFileRepository.getStudents()) {
            total += student.getName().length();
            count++;
        }
        average = total / count;

        return ResponseEntity.ok(average);
    }


    @GetMapping("/averageStudentsCount")
    public ResponseEntity<?> averageStudentsCount() throws FileNotFoundException {

        double count = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        double total = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (Student student: studentFileRepository.getStudents()) {
            if(student.getGroup()equals("IT1901")) {
                a++;
            }
            if(student.getGroup()equals("IT1906")){
                b++;
            }
            if(student.getGroup()equals("IT1910")){
                c++;
            }
            if(student.getGroup()equals("IT1914")){
                d++;
            }

        }
        total=a+b+c+d;
        count=total / 4;
        return ResponseEntity.ok(count);
    }

    @GetMapping("/averageStudentsPoint")
    public ResponseEntity<?> averageStudentsPoint() throws FileNotFoundException {

        double average = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        double total = 0;
        int count = 0;
        for (Student student: studentFileRepository.getStudents()) {
            total += student.getPoint();
            count++;
        }
        average = total / count;
        return ResponseEntity.ok(average);
    }

    @GetMapping("/averageStudentsAge")
    public ResponseEntity<?> averageStudentsAge() throws FileNotFoundException {

        double average = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        double total = 0;
        int count = 0;
        for (Student student: studentFileRepository.getStudents()) {
            total += student.getAge();
            count++;
        }
        average = total / count;
        return ResponseEntity.ok(average);
    }

    @GetMapping("/highestStudentsPoint")
    public ResponseEntity<?> highestStudentsPoint() throws FileNotFoundException {

        double maxPoint = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        double t = 0;
        int i= 0;
        for (Student student: studentFileRepository.getStudents()) {
            t= student.getPoint(i);
            i++; }
        if( student.getPoint(i)>maxPoint) {
            student.getPoint(i)= maxPoint;
        }
        return ResponseEntity.ok(maxPoint);
    }

    @GetMapping("/highestStudentsAge")
    public ResponseEntity<?> highestStudentsAge() throws FileNotFoundException {

        double maxAge = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        double t = 0;
        int i= 0;
               for (Student student: studentFileRepository.getStudents()) {
                   t= student.getAge(i);
                   i++; }
              if(student.getAge(i)>maxAge) {
                 student.getAge(i)= maxAge;
            }

              return ResponseEntity.ok(maxAge);
    }

    @GetMapping("/highestGroupAveragePoint")
    public ResponseEntity<?> highestGroupAveragePoint() throws FileNotFoundException {

        double averageGroupPoint = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        if(student.getGroup().equals("IT1901")){
            double total1=0;
            int count1=0;
            double average1=0;
            for (Student student: studentFileRepository.getStudents()) {
                total1 += student.getPoint();
                count1++;
            }
            average1 = total1 / count1;
        }
        if(student.getGroup().equals("IT1906")){
            double total2=0;
            int count2=0;
            double average2=0;
            for (Student student: studentFileRepository.getStudents()) {
                total2 += student.getPoint();
                count2++;
            }
            average2 = total2 / count2;
        }
        if(student.getGroup().equals("IT1910")){
            double total3=0;
            int count3=0;
            double average3=0;
            for (Student student: studentFileRepository.getStudents()) {
                total3 += student.getPoint();
                count3++;
            }
            average3 = total3 / count3;
        }
        if(student.getGroup().equals("IT1914")){
            double total4=0;
            int count4=0;
            double average4=0;
            for (Student student: studentFileRepository.getStudents()) {
                total4 += student.getPoint();
                count4++;
            }
            average4 = total4 / count4;
        }
        if(average1>average2 && average1>average3 && average1>average4){
            average1= averageGroupPoint;
        }
        if(average2>average1 && average2>average3 && average1>average4){
            average2= averageGroupPoint;
        }
        if(average3>average1 && average3>average2 && average3>average4){
            average3= averageGroupPoint;
        }
        if(average4>average1 && average4>average2 && average4>average3){
            average4= averageGroupPoint;
        }

        return ResponseEntity.ok(averageGroupPoint);
    }

    @GetMapping("/highestGroupAverageAge")
    public ResponseEntity<?> highestGroupAverageAge() throws FileNotFoundException {

        double averageGroupAge = 0;
        //change your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        if(student.getGroup().equals("IT1901")){
            double total1=0;
            int count1=0;
            double average1=0;
            for (Student student: studentFileRepository.getStudents()) {
                total1 += student.getAge();
                count1++;
            }
            average1 = total1 / count1;
        }
        if(student.getGroup().equals("IT1906")){
            double total2=0;
            int count2=0;
            double average2=0;
            for (Student student: studentFileRepository.getStudents()) {
                total2 += student.getAge();
                count2++;
            }
            average2 = total2 / count2;
        }
        if(student.getGroup().equals("IT1910")){
            double total3=0;
            int count3=0;
            double average3=0;
            for (Student student: studentFileRepository.getStudents()) {
                total3 += student.getAge();
                count3++;
            }
            average3 = total3 / count3;
        }
        if(student.getGroup().equals("IT1914")){
            double total4=0;
            int count4=0;
            double average4=0;
            for (Student student: studentFileRepository.getStudents()) {
                total4 += student.getAge();
                count4++;
            }
            average4 = total4 / count4;
        }
        if(average1>average2 && average1>average3 && average1>average4){
            average1= averageGroupAge;
        }
        if(average2>average1 && average2>average3 && average1>average4){
            average2= averageGroupAge;
        }
        if(average3>average1 && average3>average2 && average3>average4){
            average3= averageGroupAge;
        }
        if(average4>average1 && average4>average2 && average4>average3){
            average4= averageGroupAge;
        }


        return ResponseEntity.ok(averageGroupAge);
    }


    @GetMapping("/all")
    public ResponseEntity<?> allData() throws FileNotFoundException {

        String result = "";
        result += "averageStudentsNameLength: " + averageStudentsNameLength().getBody() + "</br>";
        result += "averageStudentsCount: " + averageStudentsCount().getBody() + "</br>";
        result += "averageStudentsPoint: " + averageStudentsPoint().getBody() + "</br>";
        result += "averageStudentsAge: " + averageStudentsAge().getBody() + "</br>";
        result += "highestStudentsPoint: " + highestStudentsPoint().getBody() + "</br>";
        result += "highestStudentsAge: " + highestStudentsAge().getBody() + "</br>";
        result += "highestGroupAveragePoint: " + highestGroupAveragePoint().getBody() + "</br>";
        result += "highestGroupAverageAge: " + highestGroupAverageAge().getBody() + "</br>";

        return ResponseEntity.ok(result);
    }
}

