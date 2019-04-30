package com.floatCloud.loveCloud.sysOa.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.floatCloud.loveCloud.sysOa.dao.domain.SysUser;
import com.floatCloud.loveCloud.sysOa.dao.mapper.SysUserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
public class SysUserService {

    private static Logger logger = LoggerFactory.getLogger(SysUserService.class);

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
        return true;
    }

}
