package com.yurip.userdept.service;

import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.yurip.userdept.entities.User;
import com.yurip.userdept.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImp implements UserService{

    UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return unwrapUser(user, id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    static User unwrapUser(Optional<User> entity, Long id){
        return entity.get();
    }
    
}
