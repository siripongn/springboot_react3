package com.student.testing;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // @GetMapping("/")
    // public List<Student> getStudent(){
    //     return studentRepository.findAll();
    // }
    @Override
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }


    // @GetMapping("/{id}")
    // public Student getStudent(@PathVariable Integer id){
    //     return studentRepository.findById(id).orElse(null);
    // }
    @Override
    public Student getStudents(@PathVariable Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    // @PostMapping("/")
    // public Student postStudent(@Valid @RequestBody Student student){
    //     return studentRepository.save(student);
    // }
   @Override
   public Student postStudents(@Valid @RequestBody Student student){
        return studentRepository.save(student);
   }


    // @DeleteMapping("/{id}")
    // public Integer deleteStudent(@PathVariable Integer id){
    //     studentRepository.deleteById(id);
    //     return id;
    // }
    @Override
    public Integer deleteStudents(@PathVariable Integer id){
         studentRepository.deleteById(id);
         return id;
    }


    // @PutMapping("/")
    // public Student updateStudent(@Valid @RequestBody Student student){
    //     Student olderStudent = studentRepository.findById(student.getId()).orElse(null);
    //     olderStudent.setFirstName(student.getFirstName());
    //     olderStudent.setLastName(student.getLastName());
    //     olderStudent.setAge(student.getAge());
    //     olderStudent.setEmail(student.getEmail());
    //     return studentRepository.save(olderStudent);
    // }
    @Override
    public Student updateStudents(@Valid @RequestBody Student student){
        Student olderStudent = studentRepository.findById(student.getId()).orElse(null);
        olderStudent.setFirstname(student.getFirstname());
        olderStudent.setLastname(student.getLastname());
        olderStudent.setEmail(student.getEmail());
        return studentRepository.save(olderStudent);
    }

    
}
