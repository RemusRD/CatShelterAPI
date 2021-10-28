package com.example.catsproject.controller.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VolunteerResponse {
    private String name;
    private int age;
    private String sheltername;

}
