package org.ssh.service.impl;

import javafx.scene.chart.PieChart;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssh.dao.BaseDaoI;
import org.ssh.model.Tbug;
import org.ssh.pageModel.Bug;
import org.ssh.pageModel.DataGrid;
import org.ssh.service.BaseServiceI;
import org.ssh.service.BugServiceI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hyl on 17/2/25.
 */
@Service("bugService")
public class BugServiceImpl implements BugServiceI {
    @Autowired
    private BaseDaoI bugDao;

    public void add(Bug entity) {
        Tbug tbug=new Tbug();
        BeanUtils.copyProperties(entity,tbug);
        bugDao.save(tbug);
    }

    public void delete(Bug entity) {
        Tbug tbug=new Tbug();
        BeanUtils.copyProperties(entity,tbug);
        bugDao.delete(tbug);
    }

    public void update(Bug entity) {
        Tbug tbug=new Tbug();
        BeanUtils.copyProperties(entity,tbug);
        bugDao.update(tbug);
    }

    public DataGrid<Bug> datagrid(Bug entity) {
        DataGrid<Bug> dataGrid=new DataGrid<Bug>();
        String hql="from Tbug t where 1=1";
        HashMap<String,Object> params=new HashMap<String, Object>();
        List<Bug> bugList=new ArrayList<Bug>();
        List<Tbug> tbugList=bugDao.find(hql,params);
        for (Tbug tbug:tbugList
             ) {
            bugList.add(changeModel(tbug));
        }
        dataGrid.setRows(bugList);
        dataGrid.setTotal((long)bugList.size());
        return dataGrid;
    }

    private Bug changeModel(Tbug tbug) {
        Bug bug=new Bug();
        BeanUtils.copyProperties(tbug,bug);
        return bug;
    }
}
