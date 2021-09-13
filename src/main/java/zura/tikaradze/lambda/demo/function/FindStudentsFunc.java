package zura.tikaradze.lambda.demo.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import zura.tikaradze.lambda.demo.model.Student;
import zura.tikaradze.lambda.demo.repository.StudentRepository;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class FindStudentsFunc {
    @Autowired
    StudentRepository studentRepository;

    @Bean
    public Function<String, List<Student>> findStudentByName() {
        return (input) -> studentRepository.students().stream().filter(student -> student.getFullName().equals(input)).collect(Collectors.toList());
    }
}
