package org.ssh.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Tuser;
import org.ssh.pageModel.DataGrid;
import org.ssh.pageModel.User;
import org.ssh.service.BaseServiceI;
import org.ssh.service.UserServiceI;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

/**
 * Created by hyl on 17/2/22.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private BaseDaoI<Tuser> userDao;

    public void add(User user) {
        Tuser tuser=new Tuser();
        BeanUtils.copyProperties(user,tuser);
        userDao.save(tuser);
    }

    public void delete(User user) {
        Tuser tuser=new Tuser();
        BeanUtils.copyProperties(user,tuser);
        userDao.delete(tuser);
    }

    public void update(User user) {
        Tuser tuser=new Tuser();
        BeanUtils.copyProperties(user,tuser);
        userDao.delete(tuser);
    }

    public User login(User user) {
        User u = new User();
        HashMap<String,Object> params=new HashMap<String, Object>();
        params.put("name",user.getCname());
        params.put("pwd",user.getCpwd());
        String hql="from Tuser t where t.cname=:name and t.cpwd=:pwd";
        Tuser tuser=userDao.get(hql,params);
        BeanUtils.copyProperties(tuser,u);
        return u;
    }

    public DataGrid<User> datagrid(User user) {
        Tuser tuser=new Tuser();
        HashMap<String,Object> params=new HashMap<String, Object>();
        String hql="from Tuser t where 1=1";
        List<Tuser> list=userDao.find(hql,params);
        List<User> l=new ArrayList<User>();
        DataGrid<User> datagrid=new DataGrid<User>();

        for (Tuser u:list) {
            l.add(changeModel(u));
        }
        datagrid.setRows(l);
        datagrid.setTotal((long)l.size());
        return datagrid;
    }

    private User changeModel(Tuser tuser) {
        User user=new User();
        BeanUtils.copyProperties(tuser,user);
        return  user;
    }
}
