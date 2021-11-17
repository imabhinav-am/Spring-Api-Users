package com.example.casestudyapi.Users;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UsersDao {

    private final List<User> listOfUsers = new ArrayList<>( Arrays.asList(
            new User(1, "Leanne Graham", "Bret", "Sincere@april.biz",
                    new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874",
                            new Geo("31.007", "53.879")), "000-000-0000", "www.abc.com",
                    new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")),
            new User(2, "Leanne Graham", "Bret", "Sincere@april.biz",
                    new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874",
                            new Geo("39.07", "53.87")), "111-000-0000", "www.abc.com",
                    new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"))
    ));

    public List<User> getAllUsers(){
        return listOfUsers;
    }

    public User getUser(Integer id){
        return listOfUsers.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(new User());
    }


    public void adduser(User user) {
        user.setId(listOfUsers.size()+1);
        listOfUsers.add(user);
    }
}
