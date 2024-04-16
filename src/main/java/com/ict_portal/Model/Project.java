package com.ict_portal.Model;

import jakarta.persistence.*;
import java.util.Date;

/*
  CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enroll` bigint(20) NOT NULL,
  `sem` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `discri` text NOT NULL,
  `team` varchar(150) NOT NULL,
  `github` varchar(1000) NOT NULL,
  `startd` date NOT NULL,
  `endd` date NOT NULL,
  `stats` varchar(50) NOT NULL,
  `tdt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `cloud` varchar(1000) NOT NULL,
  `youtube` varchar(1000) NOT NULL,
  `type` text NOT NULL,
  `project_domain` text NOT NULL,
  `mentor` varchar(200) NOT NULL,
  `cost` int(11) NOT NULL,
  `file` varchar(70) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
 */

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "enroll", nullable = false)
    private Long enroll;

    @Column(name = "sem", nullable = false)
    private Integer sem;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "discri", nullable = false, columnDefinition = "TEXT")
    private String discri;

    @Column(name = "team", nullable = false, length = 150)
    private String team;

    @Column(name = "github", nullable = false, length = 1000)
    private String github;

    @Column(name = "startd", nullable = false)
    private Date startd;

    @Column(name = "endd", nullable = false)
    private Date endd;

    @Column(name = "stats", nullable = false, length = 50)
    private String stats;

    // @Column(name = "tdt", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    // private Date tdt;
    @Column(name = "tdt", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date tdt;

    @Column(name = "cloud", nullable = false, length = 1000)
    private String cloud;

    @Column(name = "youtube", nullable = false, length = 1000)
    private String youtube;

    @Column(name = "type", nullable = false, columnDefinition = "TEXT")
    private String type;

    @Column(name = "project_domain", nullable = false, columnDefinition = "TEXT")
    private String projectDomain;

    @Column(name = "mentor", nullable = false, length = 200)
    private String mentor;

    @Column(name = "cost", nullable = false)
    private Integer cost;

    @Column(name = "file", nullable = false, length = 70)
    private String file;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEnroll() {
        return enroll;
    }

    public void setEnroll(Long enroll) {
        this.enroll = enroll;
    }

    public Integer getSem() {
        return sem;
    }

    public void setSem(Integer sem) {
        this.sem = sem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscri() {
        return discri;
    }

    public void setDiscri(String discri) {
        this.discri = discri;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public Date getStartd() {
        return startd;
    }

    public void setStartd(Date startd) {
        this.startd = startd;
    }

    public Date getEndd() {
        return endd;
    }

    public void setEndd(Date endd) {
        this.endd = endd;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public Date getTdt() {
        return tdt;
    }

    public void setTdt(Date tdt) {
        this.tdt = tdt;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProjectDomain() {
        return projectDomain;
    }

    public void setProjectDomain(String projectDomain) {
        this.projectDomain = projectDomain;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}
