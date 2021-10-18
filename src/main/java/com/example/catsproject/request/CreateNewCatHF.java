package com.example.catsproject.request;

import com.example.catsproject.model.CatBreed;
import lombok.*;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateNewCatHF {
 @Enumerated
    private CatBreed catBreed;
    @NotBlank
    private String name;
}
