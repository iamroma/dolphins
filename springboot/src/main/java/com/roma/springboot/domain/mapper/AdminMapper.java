package com.roma.springboot.domain.mapper;

import com.roma.springboot.domain.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by roma on 20/04/2017.
 */
public interface AdminMapper {

    public void addAdmin(Admin admin);

    public List<Admin> findAdmins();
}
