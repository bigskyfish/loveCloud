package com.floatCloud.loveCloud.sysOa.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class SysDept implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.id
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.name
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.parent_id
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.level
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private String level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.seq
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private Integer seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.remark
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.operator
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.operate_time
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private Date operateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.operate_ip
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private String operateIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dept
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.id
     *
     * @return the value of sys_dept.id
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.id
     *
     * @param id the value for sys_dept.id
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.name
     *
     * @return the value of sys_dept.name
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.name
     *
     * @param name the value for sys_dept.name
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.parent_id
     *
     * @return the value of sys_dept.parent_id
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.parent_id
     *
     * @param parentId the value for sys_dept.parent_id
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.level
     *
     * @return the value of sys_dept.level
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.level
     *
     * @param level the value for sys_dept.level
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.seq
     *
     * @return the value of sys_dept.seq
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.seq
     *
     * @param seq the value for sys_dept.seq
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.remark
     *
     * @return the value of sys_dept.remark
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.remark
     *
     * @param remark the value for sys_dept.remark
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.operator
     *
     * @return the value of sys_dept.operator
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.operator
     *
     * @param operator the value for sys_dept.operator
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.operate_time
     *
     * @return the value of sys_dept.operate_time
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.operate_time
     *
     * @param operateTime the value for sys_dept.operate_time
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.operate_ip
     *
     * @return the value of sys_dept.operate_ip
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.operate_ip
     *
     * @param operateIp the value for sys_dept.operate_ip
     *
     * @mbg.generated Sat Apr 27 17:04:36 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}