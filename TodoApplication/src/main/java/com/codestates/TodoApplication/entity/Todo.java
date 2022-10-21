package com.codestates.TodoApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    private long id;
    private String title;
    private Boolean completed;
    private long orders;
}
