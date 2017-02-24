package org.ssh.service;

import org.ssh.pageModel.DataGrid;
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
    void add(User user);
    /**
     * delete
     * @param user
     * @return void
     */
    void delete(User user);
    /**
     * update
     * @param user
     * @return void
     *
     */
    void update(User user);

    /**
     *
     * @param user
     * @return user
     */
    User login(User user);

    /**
     *
     * @param user
     * @return DataGrid
     */
    DataGrid<User> datagrid(User user);

}
