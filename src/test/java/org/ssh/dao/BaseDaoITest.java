package org.ssh.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssh.model.Tuser;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by hyl on 17/2/21.
 * 配置spring和junit整合,junit启动时加载springIOC容器
 * spring-test,junit(RunWith(启动springIOC容器))
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件,这样才能加载springIOC容器
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseDaoITest {
    @Autowired
    private  BaseDaoI<Tuser> tuserDao;
    @Test
    public void save() throws Exception {
        //Tuser tuser=new Tuser();
        //tuser.setCname("xxxfd");
        //tuserDao.save(tuser);
    }

}