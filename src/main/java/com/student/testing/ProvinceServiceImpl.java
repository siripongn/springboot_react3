package com.student.testing;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    // @GetMapping("/")
    // public List<Student> getStudent(){
    //     return studentRepository.findAll();
    // }
    

    @Override
    public List<Province> getProvinces(){
        return provinceRepository.findAll();
    }


    // @GetMapping("/{id}")
    // public Student getStudent(@PathVariable Integer id){
    //     return studentRepository.findById(id).orElse(null);
    // }
    @Override
    public Province getProvinces(@PathVariable Integer PROVINCE_ID){
        return provinceRepository.findById(PROVINCE_ID).orElse(null);
    }

    // @PostMapping("/")
    // public Student postStudent(@Valid @RequestBody Student student){
    //     return studentRepository.save(student);
    // }
   


    // @DeleteMapping("/{id}")
    // public Integer deleteStudent(@PathVariable Integer id){
    //     studentRepository.deleteById(id);
    //     return id;
    // }
    

    // @PutMapping("/")
    // public Student updateStudent(@Valid @RequestBody Student student){
    //     Student olderStudent = studentRepository.findById(student.getId()).orElse(null);
    //     olderStudent.setFirstName(student.getFirstName());
    //     olderStudent.setLastName(student.getLastName());
    //     olderStudent.setAge(student.getAge());
    //     olderStudent.setEmail(student.getEmail());
    //     return studentRepository.save(olderStudent);
    // }
    
    
}
