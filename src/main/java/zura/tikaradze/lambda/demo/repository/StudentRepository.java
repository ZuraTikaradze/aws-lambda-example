package zura.tikaradze.lambda.demo.repository;

import zura.tikaradze.lambda.demo.model.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> students();

    void addStudent(Student student);
}
