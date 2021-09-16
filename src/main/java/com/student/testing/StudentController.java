package com.student.testing;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apistudent")
@Validated
@CrossOrigin

public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@Valid @PathVariable Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public Student postStudent(@Valid @RequestBody Student student){
        return studentRepository.save(student);
    }
    
    @DeleteMapping("/{id}")
    public Integer deleteStudent(@Valid @PathVariable Integer id){
        studentRepository.deleteById(id);
        return id;
    }

    @PutMapping("/")
    public Student updateStudent(@Valid @RequestBody Student student){
        Student olderStudent = studentRepository.findById(student.getId()).orElse(null);
        olderStudent.setFirstname(student.getFirstname());
        olderStudent.setLastname(student.getLastname());
        olderStudent.setEmail(student.getEmail());
        return studentRepository.save(olderStudent);
    }

}
