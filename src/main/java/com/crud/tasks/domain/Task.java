package com.crud.tasks.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name= "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
                    generator = "native")
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Long id;
    @Column(name = "name")
    private String title;
    @Column(name = "descriptionx")
    private String content;

    public Task(final String title, final String content) {
        this.title=title;
        this.content=content;
    }

}
