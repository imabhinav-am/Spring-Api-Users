package com.example.casestudyapi.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//public Users(Integer id, String name, String username, String email, Address address, String phone, String website, Company company) {

@Service
public class UsersService {

    private final UsersDao usersDao;

    @Autowired
    public UsersService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public List<User> getAllUsers() {
        return usersDao.getAllUsers();
    }

    public User getUser(Integer id) {
        return usersDao.getUser(id);
    }

    public void adduser(User user) {
        usersDao.adduser(user);
    }
}
