package com.floatCloud.loveCloud.sysOa.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.floatCloud.loveCloud.common.pojo.JsonDataDTO;
import com.floatCloud.loveCloud.sysOa.dao.domain.SysUser;
import com.floatCloud.loveCloud.sysOa.service.SysUserService;

/**
 * 登录Controller
 * @author FloatCloud
 * @date 2019/04/30
 */
@Controller
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/index.json")
    public String index(){
        return "sys/signin";
    }

    @RequestMapping("/login.json")
    public String login(SysUser sysUser){
        /*获取验证的主体*/
        Subject subject = SecurityUtils.getSubject();
        /*获取Session*/
        Session session = subject.getSession();
        if(!subject.isAuthenticated()){ //验证通过
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("username","password");
            /*设置记住账号*/
            usernamePasswordToken.setRememberMe(true);
            /**
             * 登录方法；
             * TODO 报的用户常见异常要进行捕捉处理
             */
            subject.login(usernamePasswordToken);
        }
        /*退出登录*/
        subject.logout();
        return "";
    }

    @RequestMapping(value = "/textException.json",method = RequestMethod.GET)
    public JsonDataDTO textException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        Map<String, String[]> map = httpServletRequest.getParameterMap();
        logger.info(map.toString());
        return JsonDataDTO.success("成功");
    }

}
