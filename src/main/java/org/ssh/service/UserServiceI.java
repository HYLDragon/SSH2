package org.ssh.service;

import org.ssh.pageModel.User;

/**
 * Created by hyl on 17/2/22.
 */
public interface UserServiceI {
    /**
     * add
     * @param user
     * @return void
     */
    public void add(User user);
    /**
     * delete
     * @param user
     * @return void
     */
    public void delete(User user);
    /**
     * update
     * @param user
     * @return void
     *
     */
    public void update(User user);

    /**
     *
     * @param user
     * @return user
     */
    public User login(User user);

}
