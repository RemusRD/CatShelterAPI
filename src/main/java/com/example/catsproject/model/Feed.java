package com.example.catsproject.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Feed {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    private LocalDateTime time;
    @Enumerated (EnumType.STRING)
    private CatFeedStatus status;



}

