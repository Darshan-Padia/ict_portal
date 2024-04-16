package com.ict_portal.Controller;

import com.ict_portal.Model.Student;
import com.ict_portal.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("/grNo/{grNo}")
    public List<Student> getStudentsBygrNo(@PathVariable Long grNo) {
        return studentService.findStudentsBygrNo(grNo);
    }

    @GetMapping("/enroll/{enroll}")
    public List<Student> getStudentsByEnroll(@PathVariable Long enroll) {
        return studentService.findStudentsByEnroll(enroll);
    }

    @GetMapping("/firstName/{firstName}")
    public List<Student> getStudentsByFirstName(@PathVariable String firstName) {
        return studentService.findStudentsByFirstName(firstName);
    }

    @GetMapping("/lastName/{lastName}")
    public List<Student> getStudentsByLastName(@PathVariable String lastName) {
        return studentService.findStudentsByLastName(lastName);
    }

    @GetMapping("/gender/{gender}")
    public List<Student> getStudentsByGender(@PathVariable String gender) {
        return studentService.findStudentsByGender(gender);
    }

    @GetMapping("/sem/{sem}")
    public List<Student> getStudentsBySem(@PathVariable Integer sem) {
        return studentService.findStudentsBySem(sem);
    }

    @GetMapping("/course/{course}")
    public List<Student> getStudentsByCourse(@PathVariable String course) {
        return studentService.findStudentsByCourse(course);
    }

    @GetMapping("/birthDate/{birthDate}")
    public List<Student> getStudentsByBirthDate(@PathVariable Date birthDate) {
        return studentService.findStudentsByBirthDate(birthDate);
    }

    @GetMapping("/bloodGroup/{bloodGroup}")
    public List<Student> getStudentsByBloodGroup(@PathVariable String bloodGroup) {
        return studentService.findStudentsByBloodGroup(bloodGroup);
    }

    @GetMapping("/email/{email}")
    public List<Student> getStudentsByEmail(@PathVariable String email) {
        return studentService.findStudentsByEmail(email);
    }

    @GetMapping("/pin/{pin}")
    public List<Student> getStudentsByPin(@PathVariable Long pin) {
        return studentService.findStudentsByPin(pin);
    }

    @GetMapping("/adhar/{adhar}")
    public List<Student> getStudentsByAdhar(@PathVariable Long adhar) {
        return studentService.findStudentsByAdhar(adhar);
    }

    @GetMapping("/stat/{stat}")
    public List<Student> getStudentsByStat(@PathVariable Integer stat) {
        return studentService.findStudentsByStat(stat);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{enroll}")
    public void deleteStudent(@PathVariable Long enroll) {
        studentService.deleteStudent(enroll);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }
}
