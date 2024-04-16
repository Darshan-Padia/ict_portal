package com.ict_portal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict_portal.Model.Project;
import com.ict_portal.Repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // Find by ID
    public Project findProjectById(long id) {
        return projectRepository.findById(id);
    }

    // Find by enroll
    public List<Project> findProjectsByEnroll(long enroll) {
        return projectRepository.findByEnroll(enroll);
    }

    // Find by sem
    public List<Project> findProjectsBySem(int sem) {
        return projectRepository.findBySem(sem);
    }

    // Find by title
    public List<Project> findProjectsByTitle(String title) {
        return projectRepository.findByTitleContaining(title);
    }

    // Find by discri
    public List<Project> findProjectsByDiscri(String discri) {
        return projectRepository.findByDiscriContaining(discri);
    }

    // Find by team
    public List<Project> findProjectsByTeam(String team) {
        return projectRepository.findByTeamContaining(team);
    }

    // Find by mentor
    public List<Project> findProjectsByMentor(String mentor) {
        return projectRepository.findByMentorContaining(mentor);
    }

    public List<Project> findAllProjects() {
       return projectRepository.findAll();
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

}
