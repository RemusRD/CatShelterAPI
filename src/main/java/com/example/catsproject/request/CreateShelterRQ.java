package com.example.catsproject.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateShelterRQ {
    private String name;
    private String location;
    private int volunteers;
}
