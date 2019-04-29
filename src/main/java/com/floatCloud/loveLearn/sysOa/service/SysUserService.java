package com.floatCloud.loveLearn.sysOa.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.floatCloud.loveLearn.sysOa.dao.domain.SysUser;
import com.floatCloud.loveLearn.sysOa.dao.mapper.SysUserMapper;

@Service
public class SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    /**
     *
     * @return 获取所有User集合
     */
    public List<SysUser> getAllUserList(){
        List<SysUser> sysUserList = sysUserMapper.getUserSelective();
        return sysUserList;
    }

    public boolean insertUser(){
        SysUser sysUser = SysUser.builder().id(7).deptId(1).mail("aa@163.com").username("东方月初").password("111111").build();
        sysUserMapper.insertSelective(sysUser);
        return true;
    }

}
