package com.floatCloud.loveCloud.sysOa.dao.mapper;

import com.floatCloud.loveCloud.sysOa.dao.domain.SysLogWithBLOBs;

public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    int insert(SysLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    int insertSelective(SysLogWithBLOBs record);
}