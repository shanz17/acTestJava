package com.accenture.codingtest.springbootcodingtest.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;
@Data
@Builder
@Entity
@Table(name = "task")
public class Task {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "project_id", nullable = false, columnDefinition = "uuid")
    private UUID projectId;

    @Column(name = "user_id", nullable = false, columnDefinition = "uuid")
    private UUID userId;


    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return  result;
    }

}
