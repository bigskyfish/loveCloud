package com.floatCloud.loveLearn.common.exception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.floatCloud.loveLearn.common.constants.SysCommomConstants;
import com.floatCloud.loveLearn.common.pojo.JsonDataDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Float
 * todo 全局的页面请求异常处理 【强制】规定：JSON请求以.json结尾；Page请求以.page结尾
 */

@Component
@Slf4j
public class SpringExceptionResolver implements HandlerExceptionResolver{

    @Nullable
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @Nullable Object o, Exception e) {
        ModelAndView modelAndView;
        /*获取请求的URL*/
        String url = httpServletRequest.getRequestURI().toString();
        String defaultMsg = "undefined error!";
        String viewName = SysCommomConstants.VIEWNAME;
        /*请求方式是.json*/
        if(url.endsWith(SysCommomConstants.JSONREQUEST)){
            /*判断ex异常是否继承了指定的异常*/
            if(e instanceof TestException) {
                defaultMsg = e.getMessage();
            }else{
                log.error("undefined json exception---->url:" + url,e);
            }
        }else if(url.endsWith(SysCommomConstants.PAGEREQUEST)){ //请求方式是.page
            log.error("undefined page exception---->url:" + url,e);
            viewName = SysCommomConstants.EXCEPTIONVIEWNAME;
        }else{
            log.error("undefined exception---->url:" + url,e);
        }
        JsonDataDTO jsonDataDTO = JsonDataDTO.fail(defaultMsg);
        modelAndView = new ModelAndView(viewName,jsonDataDTO.toMap());
        return modelAndView;
    }
}
