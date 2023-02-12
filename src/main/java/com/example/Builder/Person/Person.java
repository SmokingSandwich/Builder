package com.example.Builder.Person;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author ${user}
 */

@Entity
@Table(name = "builder")
@Getter
@Setter
@RequiredArgsConstructor

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    String surname;
    String name;
}
