package com.ict_portal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ict_portal.Model.Project;
import com.ict_portal.Service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.findProjectById(id);
    }

    @GetMapping("/enroll/{enroll}")
    public List<Project> getProjectsByEnroll(@PathVariable Long enroll) {
        return projectService.findProjectsByEnroll(enroll);
    }

    @GetMapping("/sem/{sem}")
    public List<Project> getProjectsBySem(@PathVariable Integer sem) {
        return projectService.findProjectsBySem(sem);
    }

    @GetMapping("/title/{title}")
    public List<Project> getProjectsByTitle(@PathVariable String title) {
        return projectService.findProjectsByTitle(title);
    }

    @GetMapping("/discri/{discri}")
    public List<Project> getProjectsByDiscri(@PathVariable String discri) {
        return projectService.findProjectsByDiscri(discri);
    }

    @GetMapping("/team/{team}")
    public List<Project> getProjectsByTeam(@PathVariable String team) {
        return projectService.findProjectsByTeam(team);
    }

    @GetMapping("/mentor/{mentor}")
    public List<Project> getProjectsByMentor(@PathVariable String mentor) {
        return projectService.findProjectsByMentor(mentor);
    }
    // get all projects
    @GetMapping("/all")
    public List<Project> getAllProjects() {
        return projectService.findAllProjects();
    }
    @PostMapping("/add")
    public Project addProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }
}
