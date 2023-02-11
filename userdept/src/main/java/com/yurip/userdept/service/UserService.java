package com.yurip.userdept.service;

import java.util.List;

import com.yurip.userdept.entities.User;

public interface UserService {
    
    User getUser(Long id);
    User saveUser(User user);
    void deleteUser(Long id);

    List<User> getAllUsers();
    
}
