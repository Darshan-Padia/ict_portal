package com.ict_portal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict_portal.Model.Student;
import com.ict_portal.Repository.StudentRepository;

import java.sql.Date;
import java.util.List;

/*
 *  // find by id
    Student findById(long id);
    // find by grNo
    List<Student> findBygrNo(long grNo);
    
 * // Find by enrollment number
    List<Student> findByEnroll(Long enroll);

    // Find by first name
    List<Student> findByFirstName(String firstName);

    // Find by last name
    List<Student> findByLastName(String lastName);

    // Find by gender
    List<Student> findByGender(String gender);

    // Find by semester
    List<Student> findBySem(Integer sem);

    // Find by course
    List<Student> findByCourse(String course);

    // Find by birth date
    List<Student> findByBirthDate(Date birthDate);

    // Find by blood group
    List<Student> findByBloodGroup(String bloodGroup);

    // Find by email
    List<Student> findByEmail(String email);

    // Find by pin
    List<Student> findByPin(Long pin);

    // Find by Aadhar number
    List<Student> findByAdhar(Long adhar);

    // Find by status
    List<Student> findByStat(Integer stat);
 */

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    public List<Student> findStudentsBygrNo(long grNo) {
        return studentRepository.findBygrNo(grNo);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> findStudentsByEnroll(Long enroll) {
        return studentRepository.findByEnroll(enroll);
    }

    public List<Student> findStudentsByFirstName(String firstName) {
        return studentRepository.findByFirstNameContaining(firstName);
    }

    public List<Student> findStudentsByLastName(String lastName) {
        return studentRepository.findByLastNameContaining(lastName);
    }

    public List<Student> findStudentsByGender(String gender) {
        return studentRepository.findByGender(gender);
    }

    public List<Student> findStudentsBySem(Integer sem) {
        return studentRepository.findBySem(sem);
    }

    public List<Student> findStudentsByCourse(String course) {
        return studentRepository.findByCourse(course);
    }

    public List<Student> findStudentsByBirthDate(Date birthDate) {
        return studentRepository.findByBirthDate(birthDate);
    }

    public List<Student> findStudentsByBloodGroup(String bloodGroup) {
        return studentRepository.findByBloodGroup(bloodGroup);
    }

    public List<Student> findStudentsByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    public List<Student> findStudentsByPin(Long pin) {
        return studentRepository.findByPin(pin);
    }

    public List<Student> findStudentsByAdhar(Long adhar) {
        return studentRepository.findByAdhar(adhar);
    }

    public List<Student> findStudentsByStat(Integer stat) {
        return studentRepository.findByStat(stat);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long enroll) {
        studentRepository.deleteById(enroll);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

}
