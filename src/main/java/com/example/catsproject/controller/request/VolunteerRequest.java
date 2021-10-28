package com.example.catsproject.controller.request;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VolunteerRequest {
    private String name;
    @Min(value = 16)
    private int age;
    private String sheltername;
}
