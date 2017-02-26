package org.ssh.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Tauth;
import org.ssh.pageModel.Auth;
import org.ssh.pageModel.DataGrid;
import org.ssh.service.AuthServiceI;

import java.awt.dnd.Autoscroll;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hyl on 17/2/25.
 */
@Service("authService")
public class AuthServiceImpl implements AuthServiceI {
    @Autowired
    private BaseDaoI authDao;

    public void add(Auth entity) {
        Tauth tauth=new Tauth();
        BeanUtils.copyProperties(entity,tauth);
        authDao.save(tauth);
    }

    public void delete(Auth entity) {
        Tauth tauth=new Tauth();
        BeanUtils.copyProperties(entity,tauth);
        authDao.delete(tauth);
    }

    public void update(Auth entity) {
        Tauth tauth=new Tauth();
        BeanUtils.copyProperties(entity,tauth);
        authDao.update(tauth);
    }

    public DataGrid<Auth> datagrid(Auth entity) {
        DataGrid<Auth> dataGrid=new DataGrid<Auth>();
        HashMap<String,Object> params=new HashMap<String, Object>();
        String hql="from Tauth t where 1=1";
        List<Tauth> tauthList=authDao.find(hql,params);
        List<Auth> authsList=new ArrayList<Auth>();
        for (Tauth tauth:tauthList
             ) {
            authsList.add(changeModel(tauth));
        }

        dataGrid.setRows(authsList);
        dataGrid.setTotal((long)authsList.size());
        return dataGrid;
    }

    private Auth changeModel(Tauth tauth) {
        Auth auth=new Auth();
        BeanUtils.copyProperties(tauth,auth);

        return auth;
    }
}
