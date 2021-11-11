package com.TreeHouse.GreenLeaf.service;

import com.TreeHouse.GreenLeaf.model.User;
import com.TreeHouse.GreenLeaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers(){

        List<User> userlist = userRepository.findAll();

        return userlist;
    }



    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User findUserByIdS(Long id){

        return userRepository.findById(id).get();
    }

    public void deleteUserS(Long id){
        userRepository.deleteById(id);
    }

    public User updateUserS (User user){
        userRepository.save(user);

        return user;
    }




}
