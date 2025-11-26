package lektion2;


import org.springframework.stereotype.Service;

@Service("jpaStudentService")

public class JpaStudentService implements StudentService {

    @Override
    public String getStudentInfo(Long id) {

        return "Här skulle JPA hämta student med id: " + id;
    }
}
