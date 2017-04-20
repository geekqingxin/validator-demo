package com.taione.valid;

import com.taione.pojos.UserEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


/**
 * Created by td on 2017/4/14.
 */
@RestController
@RequestMapping(value = "/user")
public class RestfulController {
    @Value("${application.hello}")
    private String name;
    private static final Log log = LogFactory.getLog(RestfulController.class);
    /**
     * 测试配置文件读取问题
     */
    @RequestMapping(value = "/myJsp",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView home (){
        ModelAndView model = new ModelAndView("123");
        model.addObject("hello",name);
    return model;
    }
    /**
     * 测试ajax
     */
    @RequestMapping(value = "/{name}/{pawd}",method = RequestMethod.POST)
    public String url(@PathVariable String name,@PathVariable String pawd){
        log.debug("======================>"+name+"and"+pawd);
        return "lalulale";
    }
    @RequestMapping(value = "/valid/user/form",method = RequestMethod.POST)
    public String validEntity(@Valid UserEntity entity){
        return "success";
    }
}
