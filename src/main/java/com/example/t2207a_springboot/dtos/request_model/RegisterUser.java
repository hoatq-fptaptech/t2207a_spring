package com.example.t2207a_springboot.dtos.request_model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUser {
    public String fullName;
    public String email;
    public String password;
}
