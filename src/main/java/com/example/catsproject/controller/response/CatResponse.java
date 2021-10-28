package com.example.catsproject.controller.response;

import com.example.catsproject.model.CatBreed;
import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class CatResponse { 
    private Long id;
    private String name;
    private int age;
    private CatBreed catBreed;


}
