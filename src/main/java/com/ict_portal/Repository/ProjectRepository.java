package com.ict_portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ict_portal.Model.Project;

import java.util.*; // Import Optional

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    // Find by ID
    Project findById(long id);

    // Find by enroll
    List<Project> findByEnroll(long enroll);

    // Find by sem
    List<Project> findBySem(int sem);

    // Find by title
    List<Project> findByTitleContaining(String title);

    // Find by discri
    List<Project> findByDiscriContaining(String discri);

    // Find by team
    List<Project> findByTeamContaining(String team);

    // Find by mentor
    List<Project> findByMentorContaining(String mentor);
}