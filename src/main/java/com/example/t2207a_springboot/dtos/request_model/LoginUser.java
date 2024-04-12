package com.example.t2207a_springboot.dtos.request_model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LoginUser {
    public String email;
    public String password;
}
