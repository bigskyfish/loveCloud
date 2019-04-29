package com.floatCloud.loveLearn.sysOa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.floatCloud.loveLearn.common.pojo.JsonDataDTO;
import com.floatCloud.loveLearn.sysOa.dao.domain.SysUser;
import com.floatCloud.loveLearn.sysOa.service.SysUserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/index.json")
    public String index(ModelMap modelMap){
        List<SysUser> sysUsers = sysUserService.getAllUserList();
        modelMap.addAttribute("users",sysUsers);
        return "sys/signin";
    }

    @RequestMapping(value = "/textException.json",method = RequestMethod.GET)
    public JsonDataDTO textException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Map<String, String[]> map = httpServletRequest.getParameterMap();
        log.info(map.toString());
        return JsonDataDTO.success("成功");
    }

}
