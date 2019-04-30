package com.floatCloud.loveCloud.sysOa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.floatCloud.loveCloud.LoveLearnApplication;
import com.floatCloud.loveCloud.common.pojo.JsonDataDTO;
import com.floatCloud.loveCloud.sysOa.dao.domain.SysUser;
import com.floatCloud.loveCloud.sysOa.service.SysUserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);


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
        logger.info(map.toString());
        return JsonDataDTO.success("成功");
    }

}
