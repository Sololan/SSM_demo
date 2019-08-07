package com.SSMtest.service;

import com.SSMtest.DAO.UserDAO;
import com.SSMtest.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User getUserById(Integer userId){
        return userDAO.selectUserById(userId);
    }
}
