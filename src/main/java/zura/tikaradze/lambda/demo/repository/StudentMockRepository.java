package zura.tikaradze.lambda.demo.repository;

import org.springframework.stereotype.Repository;
import zura.tikaradze.lambda.demo.model.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class StudentMockRepository implements StudentRepository {
    @Override
    public List<Student> students() {
        return Stream.of(
                new Student("1021", "Zura", 27),
                new Student("1022", "ZuraT", 271)
        ).collect(Collectors.toList());
    }


    @Override
    public void addStudent(Student student) {
        System.out.println(student);
    }
}
