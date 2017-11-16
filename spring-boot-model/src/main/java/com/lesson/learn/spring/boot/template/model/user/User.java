/*
 * Copyright (c) 2017. @author lev-gc
 */

package com.lesson.learn.spring.boot.template.model.user;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * <b><code>User</code></b>
 * <p/>
 * User
 * <p/>
 * <b>Creation Time:</b> 2017/1/22 17:32.
 *
 * @author Elvis
 * @since spring-boot-model 1.0.0
 */
public class User implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = -7020619477594468968L;

    /**
     * The Id.
     */
    private long id;

    /**
     * The Name.
     */
    private String name;

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * To string string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
