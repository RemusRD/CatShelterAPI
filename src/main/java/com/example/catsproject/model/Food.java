package com.example.catsproject.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "food")
@Entity
public class Food {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String description;
}
