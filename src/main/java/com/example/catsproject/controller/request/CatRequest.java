package com.example.catsproject.controller.request;

import com.example.catsproject.model.CatBreed;
import lombok.*;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CatRequest {
private String name;
 private int age;
 private CatBreed catBreed;
}
