package com.roma.springboot.controller;

import com.roma.springboot.domain.entity.Admin;
import com.roma.springboot.domain.mapper.AdminMapper;
import com.roma.springboot.helper.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by roma on 21/04/2017.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping(value = "/admin/add", method = RequestMethod.GET)
    public @ResponseBody APIResponse addAdmin() {

        adminMapper.addAdmin(new Admin("cc"));

        return new APIResponse(true, "添加成功");
    }

    @RequestMapping(value = "/admin/list", method = RequestMethod.GET)
    public @ResponseBody APIResponse getAdmins() {

        List<Admin> allAdmin = adminMapper.findAdmins();

        return new APIResponse(true, allAdmin);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody APIResponse index() {
        return new APIResponse(true, "Welcome to dolphins.");
    }
}
