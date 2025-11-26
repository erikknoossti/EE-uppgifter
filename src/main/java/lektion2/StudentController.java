package lektion2;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(@Qualifier("inMemoryStudentService") StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable Long id) {
        return studentService.getStudentInfo(id);
    }
}
