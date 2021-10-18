package com.example.catsproject.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CatBed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String color;

    @OneToOne
    private CatBed catBeds;

    @OneToOne
    private Cat cat;

}
