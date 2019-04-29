package com.floatCloud.loveLearn.common.pojo;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Float
 * todo 接口返回数据封装处理：成功与否，Json格式
 */
@Getter
@Setter
public class JsonDataDTO {


    /**
     * Json请求的是否返回请求成功
     */
    private boolean ret;

    /**
     * Json请求的返回Msg
     */
    private String Msg;

    /**
     * 返回的具体数据
     */
    private Object data;

    public JsonDataDTO(boolean ret){
        this.ret = ret;
    }

    /**
     * 成功返回的方法  思考：方法名设置成 静态方法 还是私有方法好？为什么
     * @return JsonDataDTO
     */
    public static JsonDataDTO success(String msg, Object data){
        JsonDataDTO jsonDataDTO = new JsonDataDTO(true);
        jsonDataDTO.Msg = msg;
        jsonDataDTO.data = data;
        /*还有一种写法 private，不知道这两种哪种好？*/
       /* this.ret = true;
        this.Msg = msg;
        this.data = data;
        return this;*/
        return jsonDataDTO;

    }


    /**
     * 重载方法
     * @param object 返回数据
     * @return JsonDataDTO
     */
    public static JsonDataDTO success(Object object){
        JsonDataDTO jsonDataDTO = new JsonDataDTO(true);
        jsonDataDTO.data = object;
        return jsonDataDTO;

    }

    /**
     * 重载方法
     * @return JsonDataDTO
     */
    public static JsonDataDTO success(){ return new JsonDataDTO(true); }


    public static JsonDataDTO fail(String msg){
        JsonDataDTO jsonDataDTO = new JsonDataDTO(false);
        jsonDataDTO.Msg = msg;
        return jsonDataDTO;
    }

    /**
     * 将Json实体类转换为Map的数据格式
     * @return Map
     */
    public Map<String,Object> toMap(){
        Map<String,Object> rMap = new HashMap<>();
        rMap.put("ret",ret);
        rMap.put("msg",Msg);
        rMap.put("data",data);
        return rMap;
    }

}
