package com.skbcourse.hw10.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getRole {

    @GetMapping( value = "/public/api")
    public String getRolePublic() {
        return "public";
    }

    @GetMapping(value = "/admin/api")
    public ResponseEntity<Object> getRoleAdmin(Authentication auth) {
        var json = new JSONObject();
        json.put("name", auth.getName());
        json.put("roles", auth.getAuthorities());
        return new ResponseEntity<>(json.toMap(), HttpStatus.OK);
    }

    @GetMapping(value = "/support/api")
    public ResponseEntity<Object> getRoleSupport(Authentication auth) {
        var json = new JSONObject();
        json.put("name", auth.getName());
        json.put("roles", auth.getAuthorities());
        return new ResponseEntity<>(json.toMap(), HttpStatus.OK);
    }

}
