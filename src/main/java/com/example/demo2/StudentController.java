package com.example.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000") //default port for react
@RestController
public class StudentController {

@Autowired
StudentRepo sr;

@GetMapping("/students")
public List<Student> getAllStudents()
{
return sr.findAll();
}

@PostMapping("/students")
public Student createStudents(@RequestBody Student studobj)
{
return sr.save(studobj);
}

}
