package org.ssh.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Trole;
import org.ssh.pageModel.DataGrid;
import org.ssh.pageModel.Role;
import org.ssh.service.BaseServiceI;
import org.ssh.service.RoleServiceI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hyl on 17/2/25.
 */
@Service("roleService")
public class RoleServiceImpl implements RoleServiceI {
    @Autowired
    private BaseDaoI roleDao;

    public void add(Role entity) {
        Trole trole=new Trole();
        BeanUtils.copyProperties(entity,trole);
        roleDao.save(trole);
    }

    public void delete(Role entity) {
        Trole trole=new Trole();
        BeanUtils.copyProperties(entity,trole);
        roleDao.delete(trole);
    }

    public void update(Role entity) {
        Trole trole=new Trole();
        BeanUtils.copyProperties(entity,trole);
        roleDao.update(trole);
    }

    public DataGrid<Role> datagrid(Role entity) {
        DataGrid<Role> dataGrid=new DataGrid<Role>();
        String hql="from Trole t where 1=1";
        HashMap<String,Object> params=new HashMap<String, Object>();
        List<Role> roleList=new ArrayList<Role>();
        List<Trole> troleList=roleDao.find(hql,params);
        for (Trole trole:troleList
             ) {
            roleList.add(changeModel(trole));
        }

        dataGrid.setRows(roleList);
        dataGrid.setTotal((long)roleList.size());
        return dataGrid;
    }

    private Role changeModel(Trole trole) {
        Role role=new Role();
        BeanUtils.copyProperties(trole,role);
        return role;
    }
}
