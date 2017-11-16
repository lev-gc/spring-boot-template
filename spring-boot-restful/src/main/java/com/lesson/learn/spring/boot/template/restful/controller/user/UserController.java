/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.restful.controller.user;

import com.lesson.learn.spring.boot.template.model.user.User;
import com.lesson.learn.spring.boot.template.restful.service.user.UserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <b><code>UserController</code></b>
 * <p/>
 * UserController
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 17:44.
 *
 * @author Elvis
 * @since spring-boot-restful 1.0.0
 */
@RestController
@RequestMapping("/v1")
@Api(tags = "User")
public class UserController {

    /**
     * The constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    /**
     * The User service.
     */
    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Add user response entity.
     *
     * @param user the user
     * @return the response entity
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Add User", notes = "Add a user.", tags = "User")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "success request"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> addUser(
            @RequestBody User user) {
        try {
            userService.addUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to add user, user:" + user.toString(), t);
            return new ResponseEntity<>(t, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Delete user response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Delete User", notes = "Delete a user.", tags = "User")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> deleteUser(
            @ApiParam(value = "ID", required = true) @PathVariable long id
    ) {
        try {
            userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to delete user of id[" + id + "]", t);
            return new ResponseEntity<>(t, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Get User", notes = "Get a user.", tags = "User")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> getUser(
            @ApiParam(value = "ID", required = true) @PathVariable long id
    ) {
        try {
            User user = userService.getUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to get user by id[" + id + "]", t);
            return new ResponseEntity<>(t, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Update user response entity.
     *
     * @param user the user
     * @return the response entity
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Update User", notes = "Update a user.", tags = "User")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful query"),
            @ApiResponse(code = 500, message = "internal server error")})
    public ResponseEntity<?> updateUser(
            @RequestBody User user
    ) {
        try {
            userService.updateUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Throwable t) {
            LOG.error("Failed to update user, user:" + user.toString(), t);
            return new ResponseEntity<>(t, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
