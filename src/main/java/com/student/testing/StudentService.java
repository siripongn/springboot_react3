package com.student.testing;
import java.util.List;

public interface StudentService {

    public List<Student> getStudents();
    public Student getStudents(Integer id);
    public Student postStudents(Student student);
    public Integer deleteStudents(Integer id);
    public Student updateStudents(Student student);
    
}
