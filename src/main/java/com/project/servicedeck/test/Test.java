package com.project.servicedeck.test;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "test_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime createdAt;
}

