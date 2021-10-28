package com.example.catsproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Volunteers")
@Entity
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    Column
    private String name;
    private int age;
    private String sheltername;
}
