package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher){
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacherPair(int studentId , int teacherId) {
        studentRepository.addStudentTeacherPair(studentId , teacherId);
    }

    public Student getStudentByName(String name){
        return studentRepository.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name){
        return studentRepository.getTeacherByName(name);
    }

    public List<String> getStudentsByTeacherName(String name){
        return studentRepository.getStudentsByTeacherName(name);
    }

    public List<String> getAllStudent(){
        return studentRepository.getAllStudent();
    }

    public void deleteTeacherAndItsStudentByTeacherName(String name){
        studentRepository.deleteTeacherAndItsStudentByTeacherName(name);
    }

    public void deleteAllRecord(){
        studentRepository.deleteAllRecord();
    }

}
