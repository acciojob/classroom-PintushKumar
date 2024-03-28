package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    HashMap<Integer , Student> studentHashMap;
    HashMap<Integer , Teacher> teacherHashMap;
    HashMap<Integer , List<Integer>> teacherStudentHashMap;

    public StudentRepository() {
        this.studentHashMap = new HashMap<>();
        this.teacherHashMap = new HashMap<>();
        this.teacherStudentHashMap = new HashMap<>();
    }

    public void addStudent(Student student){
        if(student != null){
            studentHashMap.put(student.getId(), student);
        }
    }

    public void addTeacher(Teacher teacher){
        if(teacher!=null){
            teacherHashMap.put(teacher.getId(), teacher);
        }
    }

    public void addStudentTeacherPair(int studentId , int teacherId){
        if(studentHashMap.containsKey(studentId) && teacherHashMap.containsKey(teacherId)){
            if(teacherStudentHashMap.containsKey(studentId)){
                teacherStudentHashMap.get(teacherId).add(studentId);
               teacherHashMap.get(teacherId).setNumberOfStudents(teacherStudentHashMap.get(teacherId).size());
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(studentId);
                teacherStudentHashMap.put(studentId , list);
                teacherHashMap.get(teacherId).setNumberOfStudents(teacherStudentHashMap.get(teacherId).size());
            }
        }
    }


    public Student getStudentByName(String name){
        Student student = null;
        for(int key : studentHashMap.keySet()){
            if(studentHashMap.get(key).getName().equals(name)){
                student=studentHashMap.get(key);
            }
        }
         return student;
    }

    public Teacher getTeacherByName(String name){
        Teacher teacher = null;
        for(int key : teacherHashMap.keySet()){
            if(teacherHashMap.get(key).getName().equals(name)){
                teacher=teacherHashMap.get(key);
            }
        }
        return teacher;
    }

    public List<String> getStudentsByTeacherName(String name){
        int id = -1;
        for(int key : teacherHashMap.keySet()){
            if(teacherHashMap.get(key).getName().equals(name)){
                id = key;
            }
        }
        List<Integer> studentList = teacherStudentHashMap.getOrDefault(id , null);
        List<String> studentList1 = new ArrayList<>();
        for(int key : studentList){
            studentList1.add(studentHashMap.get(key).getName());
        }

        return studentList1;

    }

    public List<String> getAllStudent(){
        List<String> studentList = new ArrayList<>();
        for(int key : studentHashMap.keySet()){
            studentList.add(studentHashMap.get(key).getName());
        }
        return studentList;
    }

    public void deleteTeacherAndItsStudentByTeacherName(String name){
        List<String> studentList = getStudentsByTeacherName(name);
        for(int key : teacherHashMap.keySet()){
            if(teacherHashMap.get(key).getName().equals(name)){
                teacherHashMap.remove(key);
                break;
            }
        }

        for(String studentName : studentList){
            studentHashMap.remove(getStudentByName(studentName).getId());
        }

    }

    public void deleteAllRecord(){
        studentHashMap.clear();
        teacherHashMap.clear();
        teacherStudentHashMap.clear();
    }






}
