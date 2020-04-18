package kz.aitu.oop.controller;

import kz.aitu.oop.entity.Student;
import kz.aitu.oop.repository.StudentFileRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


@RestController
@RequestMapping("/api/task/4")
@AllArgsConstructor


public class AssignmentController4 {

    @GetMapping("/group/{group}")
    public ResponseEntity<?> getStudentsByGroup(@PathVariable("group") String group) throws FileNotFoundException {

        //write your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        String result = "";
        for (Student student: studentFileRepository.getStudents()) {
            for (student.getGroup() equals("IT1901")) {
                for (int i = 0; i < student.length(); i++) {
                    string result11 = "IT1901-" + student.getName(i);
                }
            }
        }

        for (Student student: studentFileRepository.getStudents()) {
            for (student.getGroup() equals("IT1906")) {
                for (int i = 0; i < student.length(); i++) {
                    string result12 = "IT1906-" + student.getName(i);
                }
            }
        }

        for (Student student: studentFileRepository.getStudents()) {
            for (student.getGroup() equals("IT1910")) {
                for (int i = 0; i < student.length(); i++) {
                    string result13 = "IT1910-" + student.getName(i);
                }
            }
        }

        for (Student student: studentFileRepository.getStudents()) {
            for (student.getGroup() equals("IT1916")) {
                for (int i = 0; i < student.length(); i++) {
                    string result14 = "IT1916-" + student.getName(i);
                }
            }
        }
 result= result11+result12+result13+result14;


        return ResponseEntity.ok(result);
    }

    @GetMapping("/group/{group}/stats")
    public ResponseEntity<?> getGroupStats(@PathVariable("group") String group) throws FileNotFoundException {

        //write your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        String result = "";
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        for (Student student: studentFileRepository.getStudents()) {
            for(student.getGroup()equals("IT1901")) {
            if (student.getPoint() >= 90 && student.getPoint() =<100){
                A++;
            }
            if (student.getPoint() >= 75 && student.getPoint() =<89){
                B++;
            }
            if (student.getPoint() >= 60 && student.getPoint() =<74){
                C++;
            }
            if (student.getPoint() >= 50 && student.getPoint() =<59){
                D++;
            }
            if (student.getPoint() >= 0 && student.getPoint() =<49){
                F++;
            }
            string result1= "Statistics of group IT-1901 is: "+ "A is"+A+ "B is"+ B+ "C is" + C+ "D is"+ D+ "F is"+ F
                }

            for(student.getGroup()equals("IT1906")) {
                if (student.getPoint() >= 90 && student.getPoint() =<100){
                    A++;
                }
                if (student.getPoint() >= 75 && student.getPoint() =<89){
                    B++;
                }
                if (student.getPoint() >= 60 && student.getPoint() =<74){
                    C++;
                }
                if (student.getPoint() >= 50 && student.getPoint() =<59){
                    D++;
                }
                if (student.getPoint() >= 0 && student.getPoint() =<49){
                    F++;
                }
                string result2= "Statistics of group IT-1906 is: "+ "A is"+A+ "B is"+ B+ "C is" + C+ "D is"+ D+ "F is"+ F
            }

            for(student.getGroup()equals("IT1910")) {
                if (student.getPoint() >= 90 && student.getPoint() =<100){
                    A++;
                }
                if (student.getPoint() >= 75 && student.getPoint() =<89){
                    B++;
                }
                if (student.getPoint() >= 60 && student.getPoint() =<74){
                    C++;
                }
                if (student.getPoint() >= 50 && student.getPoint() =<59){
                    D++;
                }
                if (student.getPoint() >= 0 && student.getPoint() =<49){
                    F++;
                }
                string result3= "Statistics of group IT-1910 is: "+ "A is"+A+ "B is"+ B+ "C is" + C+ "D is"+ D+ "F is"+ F
            }

            for(student.getGroup()equals("IT1914")) {
                if (student.getPoint() >= 90 && student.getPoint() =<100){
                    A++;
                }
                if (student.getPoint() >= 75 && student.getPoint() =<89){
                    B++;
                }
                if (student.getPoint() >= 60 && student.getPoint() =<74){
                    C++;
                }
                if (student.getPoint() >= 50 && student.getPoint() =<59){
                    D++;
                }
                if (student.getPoint() >= 0 && student.getPoint() =<49){
                    F++;
                }
                string result4= "Statistics of group IT-1914 is: "+ "A is"+A+ "B is"+ B+ "C is" + C+ "D is"+ D+ "F is"+ F
            }
        }
        result= result1+ result2+ result3+ result4;
        return ResponseEntity.ok(result);
    }

    @GetMapping("/students/top")
    public ResponseEntity<?> getTopStudents() throws FileNotFoundException {

        //write your code here
        StudentFileRepository studentFileRepository = new StudentFileRepository();
        String result = "";
            double maxPoint = 0;
            double top1 = 0;
           double top2 = 0;
            double top3 = 0;
            double top4 = 0;
            double top5 = 0;

            for (Student student: studentFileRepository.getStudents()) {

                maxPoint= student.getPoint(i);
                i++;
                if( student.getPoint(i)>maxPoint) {
                    student.getPoint(i)= maxPoint;
                }
                if(top1> maxPoint) {
                top1= maxPoint;
            }

                if(top2> maxPoint && top2< top1  {
                    top2= maxPoint;
                }

                if(top3> maxPoint && top3< top1 && top3< top2  {
                    top3= maxPoint;
                }
                if(top4> maxPoint && top4< top3 && top4< top2 && top4< top1  {
                    top4= maxPoint;
                }
                if(top5> maxPoint && top5< top4 && top5< top3 && top5< top2 && top5<top1  {
                    top5= maxPoint;
                }
            }

            for (Student student: studentFileRepository.getStudents()) {
                  if(student.getPoint()=top1){
                      result= student.getName()+"- is a top1 student" ;
                  }
                if(student.getPoint()=top2){
                    result= student.getName()+"- is a top2 student" ;
                }
                if(student.getPoint()=top3){
                    result= student.getName()+"- is a top3 student" ;
                }
                if(student.getPoint()=top4){
                    result= student.getName()+"- is a top4 student" ;
                }
                if(student.getPoint()=top5){
                    result= student.getName()+"- is a top5 student" ;
                }


            }

            return ResponseEntity.ok(result);
    }

}
