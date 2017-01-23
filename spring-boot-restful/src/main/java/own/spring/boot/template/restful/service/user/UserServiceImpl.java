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

    @Autowired
    private UserMapper mapper;

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     * @since spring-boot-restful 0.1
     */
    @Override
    public User getUser(long id) {
        return mapper.getUser();
    }

}
