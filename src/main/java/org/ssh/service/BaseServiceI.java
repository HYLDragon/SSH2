package org.ssh.service;

import org.ssh.pageModel.DataGrid;
import org.ssh.pageModel.User;

/**
 * Created by hyl on 17/2/25.
 */
public interface BaseServiceI <T>{
    /**
     * add
     * @param entity
     * @return void
     *
     */
    void add(T entity);
    /**
     * delete
     * @param entity
     * @return void
     */
    void delete(T entity);
    /**
     * update
     * @param entity
     * @return void
     *
     */
    void update(T entity);
    /**
     *
     * @param entity
     * @return DataGrid
     */
    DataGrid<T> datagrid(T entity);
}
