package com.example.catsproject.controller.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShelterRequest {
    private String name;
    private String location;
    private int volunteers;
}
