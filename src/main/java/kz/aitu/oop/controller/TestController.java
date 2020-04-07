package kz.aitu.oop.controller;

import kz.aitu.oop.examples.FileReader;
import kz.aitu.oop.examples.Point;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("/test")
    public ResponseEntity<?> getUserByID() throws FileNotFoundException {

        Point p1 = new Point(5, 8);
        Point p2 = new Point(1, 3);
        double distance = p2.distance(p1);

        String result = "";
        result += "Out points: </br>";
        result += "Total number of points: " + 9999 + "</br>";
        result += "Perimeter is: " + 9999 + "</br>";
        result += "Longest side is: " + 7777 + "</br>";
        result += "Average length is: " + 5555 + "</br>";

        return ResponseEntity.ok(result);
    }
}
