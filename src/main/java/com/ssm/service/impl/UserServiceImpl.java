package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public List<User> list() {
        return userDao.list();
    }
}
