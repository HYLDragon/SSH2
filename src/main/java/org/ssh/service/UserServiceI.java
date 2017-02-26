package org.ssh.service;

import org.ssh.dao.BaseDaoI;
import org.ssh.pageModel.DataGrid;
import org.ssh.pageModel.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created by hyl on 17/2/22.
 */
public interface UserServiceI extends BaseServiceI<User>{
    /**
     *
     * @param user
     * @return user
     */
    User login(User user);



}
