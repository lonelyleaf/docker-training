package com.cqhaorun.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/list")
    public List<User> list() {
        return userRepo.findAll();
    }

    @GetMapping("/{userId}")
    public User get(@PathVariable long userId) {
        return userRepo.getOne(userId);
    }

    @PutMapping()
    public User put(@RequestBody User user) {
        User saved = userRepo.save(user);
        return saved;
    }

}
