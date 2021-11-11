package com.TreeHouse.GreenLeaf.controller;


import com.TreeHouse.GreenLeaf.model.User;
import com.TreeHouse.GreenLeaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
//för connection till react
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New user saved";
    }

    @GetMapping("/allusers")
    public List<User> showAllUsers(){
        return userService.getAllUsers();
    }


    @DeleteMapping("/delete/{id}")
    private String deleteUser(@PathVariable("id")Long id){
        userService.deleteUserS(id);
        return "User deleted!";
    }
}
