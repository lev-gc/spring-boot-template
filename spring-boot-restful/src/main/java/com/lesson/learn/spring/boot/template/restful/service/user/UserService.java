/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful.service.user;

import com.lesson.learn.spring.boot.template.model.user.User;

/**
 * <b><code>UserService</code></b>
 * <p/>
 * UserService
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 17:45.
 *
 * @author Elvis
 * @since spring -boot-restful 1.0.0
 */
public interface UserService {

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
    void deleteUser(long id);

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    User getUser(long id);

    /**
     * Update user.
     *
     * @param user the user
     */
    void updateUser(User user);

}
