/*
 * Copyright (c) 2017. @author lev-gc
 */

package own.spring.boot.template.restful.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import own.spring.boot.template.model.user.User;
import own.spring.boot.template.restful.service.user.UserService;

/**
 * <b><code>UserController</code></b>
 * <p/>
 * UserController
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 17:44.
 *
 * @author Elvis
 * @since spring-boot-template 1.0
 */
@RestController
@RequestMapping("/v0.1")
public class UserController {

    /**
     * The constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    /**
     * The User service.
     */
    @Autowired
    private UserService userService;

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    @RequestMapping("/user/{id}")
    public ResponseEntity<?> getUser(
            @PathVariable long id
    ) {
        try {
            User user = userService.getUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("");
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
