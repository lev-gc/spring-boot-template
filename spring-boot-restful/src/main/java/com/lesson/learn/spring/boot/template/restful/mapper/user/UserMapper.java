/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful.mapper.user;


import com.lesson.learn.spring.boot.template.model.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <b><code>UserMapper</code></b>
 * <p/>
 * UserMapper
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 17:45.
 *
 * @author Elvis
 * @since spring-boot-restful 1.0.0
 */
@Mapper
public interface UserMapper {

    /**
     * Add user.
     *
     * @param user the user
     */
    void addUser(User user);

    /**
     * Delete user.
     *
     * @param id the id
     */
    void deleteUser(@Param("id") long id);

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    User getUser(@Param("id") long id);

    /**
     * Update user.
     *
     * @param user the user
     */
    void updateUser(User user);

}
