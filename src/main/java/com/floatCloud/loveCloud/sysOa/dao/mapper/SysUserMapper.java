package com.floatCloud.loveCloud.sysOa.dao.mapper;

import java.util.List;

import com.floatCloud.loveCloud.sysOa.dao.domain.SysUser;

public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    int insertSelective(SysUser record);

    /***
     * 获取用户对象
     * @return SysUser 用户对象
     */
    List<SysUser> getUserSelective();
}