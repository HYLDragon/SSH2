package org.ssh.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Tonline;
import org.ssh.pageModel.DataGrid;
import org.ssh.pageModel.Online;
import org.ssh.service.OnlineServiceI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hyl on 17/2/25.
 */
@Service("onlineService")
public class OnlineServiceImpl implements OnlineServiceI {
    @Autowired
    private BaseDaoI onlineDao;

    public void add(Online entity) {
        Tonline tonline=new Tonline();
        BeanUtils.copyProperties(entity,tonline);
        onlineDao.save(tonline);
    }

    public void delete(Online entity) {
        Tonline tonline=new Tonline();
        BeanUtils.copyProperties(entity,tonline);
        onlineDao.delete(tonline);
    }

    public void update(Online entity) {
        Tonline tonline=new Tonline();
        BeanUtils.copyProperties(entity,tonline);
        onlineDao.update(tonline);
    }

    public DataGrid<Online> datagrid(Online entity) {
        DataGrid<Online> dataGrid=new DataGrid<Online>();
        String hql="from Tonline t where 1=1";
        HashMap<String,Object> params=new HashMap<String, Object>();
        List<Online> onlineList=new ArrayList<Online>();
        List<Tonline> tonlineList=new ArrayList<Tonline>();
        tonlineList=onlineDao.find(hql,params);
        for (Tonline tonline:tonlineList
             ) {
            onlineList.add(changeModel(tonline));
        }
        dataGrid.setTotal((long)onlineList.size());
        dataGrid.setRows(onlineList);
        return dataGrid;
    }

    private Online changeModel(Tonline tonline) {
        Online online=new Online();
        BeanUtils.copyProperties(tonline,online);
        return online;
    }
}
