package com.example.catsproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="shelter")
@Entity
public class CatShelter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String location;
    private int volunteers;

    @OneToMany(mappedBy = "catShelter")
    private List<Cat> cats;
}
