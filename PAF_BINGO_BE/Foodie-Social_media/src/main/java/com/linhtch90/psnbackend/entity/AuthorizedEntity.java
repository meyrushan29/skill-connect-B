package com.linhtch90.psnbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Auth Update Code 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedEntity {
    private UserEntity user;
    private String token;
}
