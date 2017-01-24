/*
 * Copyright (c) 2017. @author lev-gc
 */

package own.spring.boot.template.restful.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import own.spring.boot.template.model.user.User;
import own.spring.boot.template.restful.mapper.user.UserMapper;

/**
 * <b><code>UserServiceImpl</code></b>
 * <p/>
 * UserServiceImpl
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 18:13.
 *
 * @author Elvis
 * @since spring-boot-restful 0.1
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * The Mapper.
     *
     * @since spring-boot-restful 0.1
     */
    @Autowired
    private UserMapper mapper;

    /**
     * Add user.
     *
     * @param user the user
     * @since spring-boot-restful 0.1
     */
    @Override
    public void addUser(User user) {
        mapper.addUser(user);
    }

    /**
     * Delete user.
     *
     * @param id the id
     * @since spring-boot-restful 0.1
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
     * @since spring-boot-restful 0.1
     */
    @Override
    public User getUser(long id) {
        return mapper.getUser(id);
    }

    /**
     * Update user.
     *
     * @param user the user
     * @since spring-boot-restful 0.1
     */
    @Override
    public void updateUser(User user) {
        mapper.updateUser(user);
    }

}
