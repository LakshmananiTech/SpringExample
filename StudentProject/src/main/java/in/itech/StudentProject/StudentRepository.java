package in.itech.StudentProject;

import in.itech.StudentProject.StudModel.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    List<Student> displayAll()
    {
        String q = "select * from Student";
       List<Student> studentlist = jdbcTemplate.query(q, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setSno(resultSet.getInt("sno"));
                student.setSname(resultSet.getString("Sname"));
                student.setAge(resultSet.getInt("Age"));
                return student;
            }
        });
    return studentlist;
    }
}
