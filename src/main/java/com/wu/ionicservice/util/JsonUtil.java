package com.wu.ionicservice.util;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

    public static JSONObject getFailJsonObject(String str) {
        JSONObject jobject = new JSONObject();
        jobject.put("msg",str);
        return jobject;
    }

    public static JSONObject getSuccessJsonObject(String fileName) {
        JSONObject jobject = new JSONObject();
        jobject.put("msg","文件操作成功");
        jobject.put("fileName",fileName);
        return jobject;
    }

//    public static void main(String[] args) {
//        JSONObject jobject = new JSONObject();
//        jobject.put("msg","aaaaaa");
//        jobject.put("fileName","bbbb");
//        System.out.println(jobject.toJSONString());
//    }

}
