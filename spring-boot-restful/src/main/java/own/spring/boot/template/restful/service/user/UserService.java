/*
 * Copyright (c) 2017. @author lev-gc
 */

package own.spring.boot.template.restful.service.user;

import own.spring.boot.template.model.user.User;

/**
 * <b><code>UserService</code></b>
 * <p/>
 * UserService
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 17:45.
 *
 * @author Elvis
 * @since spring-boot-restful 0.1
 */
public interface UserService {

    /**
     * Add user.
     *
     * @param user the user
     * @since spring-boot-restful 0.1
     */
    void addUser(User user);

    /**
     * Delete user.
     *
     * @param id the id
     * @since spring-boot-restful 0.1
     */
    void deleteUser(long id);

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     * @since spring-boot-restful 0.1
     */
    User getUser(long id);

    /**
     * Update user.
     *
     * @param user the user
     * @since spring-boot-restful 0.1
     */
    void updateUser(User user);

}
