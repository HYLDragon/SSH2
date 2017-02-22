package org.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Tuser;
import org.ssh.pageModel.User;
import org.ssh.service.UserServiceI;

import javax.jws.soap.SOAPBinding;

/**
 * Created by hyl on 17/2/22.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private BaseDaoI<Tuser> tuserDao;

    public void add(User user) {

    }

    public void delete(User user) {

    }

    public void update(User user) {

    }

    public User login(User user) {
        User u=new User();
        Tuser tuser=new Tuser();
        //tuser=tuserDao.get()
        return null;
    }
}
