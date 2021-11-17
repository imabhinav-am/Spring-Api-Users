package com.example.casestudyapi.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path="/users")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User getUser(@PathVariable Integer id){
        return usersService.getUser(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        usersService.adduser(user);
    }
}
