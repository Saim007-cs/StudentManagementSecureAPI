package com.example.SpringBootDemoProject.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class JwtResponse {

    private String username;

    private String jwtToken;

}
