package com.example.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {


    @NotBlank
    private String name;

    @NotBlank
    private String phone;

    private String email;

    @Min(10)
    private int age;


}
