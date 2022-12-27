package com.springapi.course.resources;

import com.springapi.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindAll() {
        User u = new User(1L, "Maria", "Maria@gmail.com", "54545454", "123456");
        return ResponseEntity.ok().body(u);
    }


}
