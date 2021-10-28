package com.example.catsproject.controller.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VolunteerRequest {
    private String name;
    private int age;
    private String sheltername;
}
