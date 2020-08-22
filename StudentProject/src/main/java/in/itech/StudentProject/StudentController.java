package in.itech.StudentProject;

import in.itech.StudentProject.StudModel.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value="/student/data/all",method= RequestMethod.GET)
    List<Student> displayAll()
    {
        List<Student> studentList1 = studentService.displayStudentAll();
        return studentList1;
    }
}
