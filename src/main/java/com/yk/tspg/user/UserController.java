package com.yk.tspg.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

}
