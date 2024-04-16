package com.ict_portal.Model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")

/*
 * 
 * CREATE TABLE `student` (
 * `fn` varchar(25) NOT NULL,
 * `mn` varchar(25) NOT NULL,
 * `ln` varchar(25) NOT NULL,
 * `gender` varchar(1) NOT NULL,
 * `grno` decimal(10,0) NOT NULL,
 * `sem` int(11) NOT NULL,
 * `course` varchar(1) NOT NULL,
 * `bd` date NOT NULL,
 * `bdgrp` varchar(7) NOT NULL,
 * `ad1` text,
 * `country` text,
 * `state` text,
 * `city` text,
 * `presentadd` text,
 * `presentcity` text,
 * `presentstate` text,
 * `presentcountry` text,
 * `pin` decimal(10,0) NOT NULL,
 * `wn` decimal(10,0) NOT NULL,
 * `email` varchar(80) NOT NULL,
 * `prno` decimal(10,0) NOT NULL,
 * `p10` decimal(10,2) NOT NULL,
 * `p12` decimal(10,2) NOT NULL,
 * `adhar` bigint(20) NOT NULL,
 * `pswd` text,
 * `enroll` bigint(20) NOT NULL DEFAULT '0',
 * `stat` tinyint(1) DEFAULT NULL,
 * `class` varchar(60) DEFAULT NULL,
 * `lab_batch` varchar(20) DEFAULT NULL,
 * `imgpath` text,
 * PRIMARY KEY (`enroll`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
public class Student {

    @Id
    @Column(name = "enroll")
    private Long enroll; // Assuming enroll is the primary key

    @Column(name = "fn", nullable = false, length = 25)
    private String firstName;

    @Column(name = "mn", nullable = false, length = 25)
    private String middleName;

    @Column(name = "ln", nullable = false, length = 25)
    private String lastName;

    @Column(name = "gender", nullable = false, length = 1)
    private String gender;

    @Column(name = "grno", nullable = false)
    private Long grNo;

    @Column(name = "sem", nullable = false)
    private Integer sem;

    @Column(name = "course", nullable = false, length = 1)
    private String course;

    @Column(name = "bd", nullable = false)
    private Date birthDate;

    @Column(name = "bdgrp", nullable = false, length = 7)
    private String bloodGroup;

    @Column(name = "ad1", columnDefinition = "TEXT")
    private String address1;

    @Column(name = "country", columnDefinition = "TEXT")
    private String country;

    @Column(name = "state", columnDefinition = "TEXT")
    private String state;

    @Column(name = "city", columnDefinition = "TEXT")
    private String city;

    @Column(name = "presentadd", columnDefinition = "TEXT")
    private String presentAddress;

    @Column(name = "presentcity", columnDefinition = "TEXT")
    private String presentCity;

    @Column(name = "presentstate", columnDefinition = "TEXT")
    private String presentState;

    @Column(name = "presentcountry", columnDefinition = "TEXT")
    private String presentCountry;

    @Column(name = "pin", nullable = false)
    private Long pin;

    @Column(name = "wn", nullable = false)
    private Long wn;

    @Column(name = "email", nullable = false, length = 80)
    private String email;

    @Column(name = "prno", nullable = false)
    private Long prNo;

    @Column(name = "p10", nullable = false)
    private Double p10;

    @Column(name = "p12", nullable = false)
    private Double p12;

    @Column(name = "adhar", nullable = false)
    private Long adhar;

    @Column(name = "pswd", columnDefinition = "TEXT")
    private String password;



    @Column(name = "stat", columnDefinition = "TINYINT")
    private Integer stat;

    @Column(name = "class", length = 60)
    private String className;

    @Column(name = "lab_batch", length = 20)
    private String labBatch;

    @Column(name = "imgpath", columnDefinition = "TEXT")
    private String imgPath;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getGrNo() {
        return grNo;
    }

    public void setGrNo(Long grNo) {
        this.grNo = grNo;
    }

    public Integer getSem() {
        return sem;
    }

    public void setSem(Integer sem) {
        this.sem = sem;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPresentCity() {
        return presentCity;
    }

    public void setPresentCity(String presentCity) {
        this.presentCity = presentCity;
    }

    public String getPresentState() {
        return presentState;
    }

    public void setPresentState(String presentState) {
        this.presentState = presentState;
    }

    public String getPresentCountry() {
        return presentCountry;
    }

    public void setPresentCountry(String presentCountry) {
        this.presentCountry = presentCountry;
    }

    public Long getPin() {
        return pin;
    }

    public void setPin(Long pin) {
        this.pin = pin;
    }

    public Long getWn() {
        return wn;
    }

    public void setWn(Long wn) {
        this.wn = wn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPrNo() {
        return prNo;
    }

    public void setPrNo(Long prNo) {
        this.prNo = prNo;
    }

    public Double getP10() {
        return p10;
    }

    public void setP10(Double p10) {
        this.p10 = p10;
    }

    public Double getP12() {
        return p12;
    }

    public void setP12(Double p12) {
        this.p12 = p12;
    }

    public Long getAdhar() {
        return adhar;
    }

    public void setAdhar(Long adhar) {
        this.adhar = adhar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEnroll() {
        return enroll;
    }

    public void setEnroll(Long enroll) {
        this.enroll = enroll;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLabBatch() {
        return labBatch;
    }

    public void setLabBatch(String labBatch) {
        this.labBatch = labBatch;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

}