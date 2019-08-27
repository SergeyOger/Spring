package com.zmex.ProjectManager.controller;

import com.zmex.ProjectManager.model.Project;
import com.zmex.ProjectManager.service.implementation.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    private ProjectServiceImpl projectService;

    @Autowired
    public ProjectController(ProjectServiceImpl projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public void addProject(@RequestBody String name) {
        Project project  = new Project();
        project.setName(name);
        projectService.addProject(project);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/projects")
    public void updateProject(@RequestBody Project project) {
        projectService.updateProject(project);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{id}")
    public void deleteProjectById(@PathVariable long id) {
        projectService.removeProjectById(id);
    }

    @RequestMapping("/projects/{id}")
    public Project getProjectById(@PathVariable long id) {
        return projectService.getProjectById(id);
    }

    @RequestMapping("/projects")
    public List<Project> projectList() {
        return projectService.getProjectList();
    }

}
