package com.crud.tasks.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
}
