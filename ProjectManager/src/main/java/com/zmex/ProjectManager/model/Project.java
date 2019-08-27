package com.zmex.ProjectManager.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROJECT_ID", unique = true)
    private long id;
    @Column(name = "PROJECT_NAME")
    private String name;
}
