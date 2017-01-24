/*
 * Copyright (c) 2017. @author lev-gc
 */

package own.spring.boot.template.restful.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
 * @since spring-boot-restful 0.1
 */
@RestController
@RequestMapping("/v0.1")
public class UserController {

    /**
     * The constant LOG.
     *
     * @since spring-boot-restful 0.1
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    /**
     * The User service.
     *
     * @since spring-boot-restful 0.1
     */
    @Autowired
    private UserService userService;

    /**
     * Add user.
     *
     * @param user the user
     * @return the response entity
     * @since spring-boot-restful 0.1
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addUser(
            @RequestBody User user
    ) {
        try {
            userService.addUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to add user, user:" + user.toString(), t);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Delete user.
     *
     * @param id the id
     * @return the response entity
     * @since spring-boot-restful 0.1
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> deleteUser(
            @PathVariable long id
    ) {
        try {
            userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to delete user of id[" + id + "]", t);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     * @since spring-boot-restful 0.1
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getUser(
            @PathVariable long id
    ) {
        try {
            User user = userService.getUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to get user by id[" + id + "]", t);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Update user.
     *
     * @param user the user
     * @return the response entity
     * @since spring-boot-restful 0.1
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> updateUser(
            @RequestBody User user
    ) {
        try {
            userService.updateUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to update user, user:" + user.toString(), t);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
