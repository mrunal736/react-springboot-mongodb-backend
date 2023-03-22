package com.example.mongoatlas.controller;

import com.example.mongoatlas.exception.UserNotFoundException;
import com.example.mongoatlas.model.User;
import com.example.mongoatlas.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Added successfully";
    }

    @GetMapping("/findAllUsers")
    public List<User> getBooks() {

        return userRepo.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Integer id){
        return userRepo.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        userRepo.deleteById(id);

        return "Deleted Successfully";
    }


}
