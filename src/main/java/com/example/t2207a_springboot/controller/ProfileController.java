package com.example.t2207a_springboot.controller;

import com.example.t2207a_springboot.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/me")
    @PreAuthorize("hasAnyAuthority('PROFILE')")
    public ResponseEntity<User> profile(){
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();
        User currentUser = (User) auth.getPrincipal();
        return ResponseEntity.ok(currentUser);
    }

    @GetMapping("/product")
    @PreAuthorize("hasAnyAuthority('PRODUCT')")
    public String products(){
        return "PRODUCT LIST";
    }
}
