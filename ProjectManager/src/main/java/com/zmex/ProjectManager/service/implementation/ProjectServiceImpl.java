package com.zmex.ProjectManager.service.implementation;

import com.zmex.ProjectManager.model.Project;
import com.zmex.ProjectManager.repository.ProjectRepository;
import com.zmex.ProjectManager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void addProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void updateProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void removeProjectById(long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project getProjectById(long id) {
        return projectRepository.findById(id).orElse(new Project());
    }

    @Override
    public List<Project> getProjectList() {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }
}
