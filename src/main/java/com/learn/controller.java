package com.learn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器的类
@Controller
 class HelloController {
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("hell Strping MVC");
        return "success";
    }
}

