package com.SSMtest.DAO;


import com.SSMtest.POJO.User;

public interface UserDAO {
    User selectUserById(Integer userId);

}
