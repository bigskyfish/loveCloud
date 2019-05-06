package com.floatCloud.loveCloud.common.shiro;

import java.util.HashMap;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.UserFilter;
import org.springframework.http.HttpStatus;

import com.alibaba.fastjson.JSON;
import com.floatCloud.loveCloud.common.utils.HttpUtils;

/**
 * CustomUserFilter
 *
 * @auther FloatCloud
 * @date 2019/5/6
 */
public class CustomUserFilter extends UserFilter{

    /**
     * 判断是否是 ajax 请求
     * 如果是，则返回 403 状态码
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        if (HttpUtils.isAjaxRequest((HttpServletRequest) request)) {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
            httpServletResponse.setContentType("application/json; charset=utf-8");
            /* TODO ResponseBo.error()*/
            httpServletResponse.getWriter().print(JSON.toJSON(new HashMap<>()));
            return false;
        } else {
            saveRequestAndRedirectToLogin(request, response);
            return false;
        }
    }
}
