package in.itech.StudentProject;

import in.itech.StudentProject.StudModel.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    List<Student> displayStudentAll()
    {
        List<Student> studentList = studentRepository.displayAll();
        return studentList;
    }
}
