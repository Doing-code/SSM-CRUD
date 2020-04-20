package com.yuanwu.crud.controller;
/**
 * @Author Ding Yue
 * @Date 2020/4/19 8:06
 * @Version 1.0
 */

import com.yuanwu.crud.bean.Department;
import com.yuanwu.crud.bean.Msg;
import com.yuanwu.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理和部门有关的请求
 * */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 返回所有的部门信息
     * */
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){

        //查出的所有部门信息
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts",list);
    }
}
