package com.ict_portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ict_portal.Model.Project;
import com.ict_portal.Model.Student;

import java.util.*; // Import Optional

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    // find by grNo
    List<Student> findBygrNo(long grNo);

    // Find by enrollment number
    List<Student> findByEnroll(Long enroll);

    // Find by first name containing
    List<Student> findByFirstNameContaining(String firstName);

    // Find by last name containing
    List<Student> findByLastNameContaining(String lastName);

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

}