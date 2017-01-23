/*
 * Copyright (c) 2017. @author lev-gc
 */

package own.spring.boot.template.model.user;

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
 * @since spring-boot-model 0.1
 */
public class User implements Serializable {

    /**
     * The constant serialVersionUID.
     *
     * @since spring-boot-model 0.1
     */
    private static final long serialVersionUID = -7020619477594468968L;

    /**
     * The Id.
     *
     * @since spring-boot-model 0.1
     */
    private long id;

    /**
     * The Name.
     *
     * @since spring-boot-model 0.1
     */
    private String name;

    /**
     * Gets id.
     *
     * @return the id
     * @since spring-boot-model 0.1
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @since spring-boot-model 0.1
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     * @since spring-boot-model 0.1
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @since spring-boot-model 0.1
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * To string.
     *
     * @return the string
     * @since spring-boot-model 0.1
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
