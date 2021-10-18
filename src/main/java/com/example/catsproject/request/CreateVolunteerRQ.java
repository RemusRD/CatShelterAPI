package com.example.catsproject.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateVolunteerRQ {
    private String name;
    private int age;
    private String sheltername;
}
