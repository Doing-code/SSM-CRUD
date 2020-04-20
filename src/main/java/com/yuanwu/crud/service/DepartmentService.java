package com.yuanwu.crud.service;

import com.yuanwu.crud.bean.Department;
import com.yuanwu.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ding Yue
 * @Date 2020/4/19 8:08
 * @Version 1.0
 */

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }
}
