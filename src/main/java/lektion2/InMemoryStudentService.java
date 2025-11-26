package lektion2;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("inMemoryStudentService")
public class InMemoryStudentService implements StudentService {

    private final Map<Long, Student> students = new HashMap<>();

    public InMemoryStudentService() {
        students.put(1L, new Student(1L, "Anna"));
        students.put(2L, new Student(2L, "Björn"));
    }

    @Override
    public String getStudentInfo(Long id) {
        Student s = students.get(id);
        if (s == null) {
            return "Student med id " + id + " hittades inte.";
        }
        return "Student: " + s.getId() + " - " + s.getName();
    }
}