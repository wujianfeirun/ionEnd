package com.wu.ionicservice.controller;

import com.wu.ionicservice.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100",methods = {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping({"/", "ion"})
public class IonDataController {

    private static final Logger logger = LoggerFactory.getLogger(IonDataController.class);

    @RequestMapping("/test")
    String home() {
        return "Hello World1!";
    }

    //RestController  默认将返回的对象转json
    //get请求，  required默认为true
    @RequestMapping(value = "/get")
    public Employee getJson(@RequestParam(required = false,defaultValue = "wwww") String name) {
        logger.info("get调用,参数="+name);
        Employee e = new Employee();
        e.setName(name);
        e.setAge("12");
        e.setGender("男");
        return e;
    }
    //get请求，  required默认为true
    @RequestMapping(value = "/getWithPath/{age}/{name}")
    public Employee getJsonWithPathParam(@PathVariable("age") String age,@PathVariable("name") String name) {
        logger.info("getWithPath调用");
        Employee e = new Employee();
        e.setName(name);
        e.setAge("12");
        e.setGender("男");
        return e;
    }

    //ResquestBody仅支持post方式，而且请求的Content-Type:application/json
    @RequestMapping(value = "/post")
    public Employee postJson(@RequestBody Employee emp) {
        logger.info("post调用");
        emp.setName(emp.getName()+"post");
        return emp;
    }

}