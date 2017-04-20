package com.taione.valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by td on 2017/4/14.
 */
@RestController
public class UserController {
    /**
     * 测试外部TOMCAT是否生效
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return  "hello my first tomcat ";
    }
}
