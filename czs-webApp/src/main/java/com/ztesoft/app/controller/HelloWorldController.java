package com.ztesoft.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description>
 *
 * Spring Boot HelloWorld Demo
 * @author cao.zhusheng
 * @version 1.0
 * @taskId
 * @CreateDate 2018/11/5
 * @see com.ztesoft.app.controller
 * @since R9
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
