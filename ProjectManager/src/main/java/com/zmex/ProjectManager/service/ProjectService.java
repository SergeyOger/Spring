package com.zmex.ProjectManager.service;

import com.zmex.ProjectManager.model.Project;

import java.util.List;

public interface ProjectService {

    void addProject(Project project);

    void updateProject(Project project);

    void removeProjectById(long id);

    Project getProjectById(long id);

    List<Project> getProjectList();

}
