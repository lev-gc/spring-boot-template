/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful.service.user;

import com.lesson.learn.spring.boot.template.model.user.User;
import com.lesson.learn.spring.boot.template.restful.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b><code>UserServiceImpl</code></b>
 * <p/>
 * UserServiceImpl
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 18:13.
 *
 * @author Elvis
 * @since spring-boot-restful 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * The Mapper.
     */
    private final UserMapper mapper;

    /**
     * Instantiates a new User service.
     *
     * @param mapper the mapper
     */
    @Autowired
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Add user.
     *
     * @param user the user
     */
    @Override
    public void addUser(User user) {
        mapper.addUser(user);
    }

    /**
     * Delete user.
     *
     * @param id the id
     */
    @Override
    public void deleteUser(long id) {
        mapper.deleteUser(id);
    }

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    @Override
    public User getUser(long id) {
        return mapper.getUser(id);
    }

    /**
     * Update user.
     *
     * @param user the user
     */
    @Override
    public void updateUser(User user) {
        mapper.updateUser(user);
    }

}
