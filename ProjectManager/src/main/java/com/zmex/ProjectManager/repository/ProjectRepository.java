package com.zmex.ProjectManager.repository;

import com.zmex.ProjectManager.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
