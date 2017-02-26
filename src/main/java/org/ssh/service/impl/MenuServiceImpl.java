package org.ssh.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Tmenu;
import org.ssh.pageModel.DataGrid;
import org.ssh.pageModel.Menu;
import org.ssh.service.BaseServiceI;
import org.ssh.service.MenuServiceI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hyl on 17/2/25.
 */
@Service("menuService")
public class MenuServiceImpl implements MenuServiceI {
    @Autowired
    private BaseDaoI menuDao;

    public void add(Menu entity) {
        Tmenu tmenu=new Tmenu();
        BeanUtils.copyProperties(entity,tmenu);
        menuDao.save(tmenu);
    }

    public void delete(Menu entity) {
        Tmenu tmenu=new Tmenu();
        BeanUtils.copyProperties(entity,tmenu);
        menuDao.delete(tmenu);
    }

    public void update(Menu entity) {
        Tmenu tmenu=new Tmenu();
        BeanUtils.copyProperties(entity,tmenu);
        menuDao.update(tmenu);
    }

    public DataGrid<Menu> datagrid(Menu entity) {
        DataGrid<Menu> dataGrid=new DataGrid<Menu>();
        String hql="from Tmenu t  where 1=1";
        HashMap<String,Object> params=new HashMap<String, Object>();
        List<Menu> menuList=new ArrayList<Menu>();
        List<Tmenu> tmenuList=menuDao.find(hql,params);
        for (Tmenu tmenu:tmenuList
             ) {
            menuList.add(changeModel(tmenu));
        }
        dataGrid.setRows(menuList);
        dataGrid.setTotal((long)menuList.size());
        return dataGrid;
    }

    private Menu changeModel(Tmenu tmenu) {
        Menu menu=new Menu();
        BeanUtils.copyProperties(tmenu,menu);
        return menu;
    }
}
